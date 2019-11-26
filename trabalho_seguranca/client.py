#!/usr/bin/env python3
"""Script for Tkinter GUI chat client."""
from socket import AF_INET, socket, SOCK_STREAM
from threading import Thread
import tkinter
from rsa import RSA
from idea import IDEA

def receive():
    """Handles receiving of messages."""
    while True:
        try:
            msg = client_socket.recv(BUFSIZ).decode("utf8")
            

            if rsa.cont != 1:
                msg_list.insert(tkinter.END, msg)
            
            elif rsa.cont > 1:
                dec = idea.get_decrypt_message(msg, idea.get_key())
                msg_list.insert(tkinter.END, msg)

            elif rsa.cont == 1:
                print("chave do idea ", msg)
                idea_key = rsa.get_decrypt_message(rsa.get_private_key(), msg);
                print("chave do idea ", idea_key)
                rsa.cont += 1
                idea.set_key(idea_key)

                #idea.set_key(msg)
            
        except OSError:  # Possibly client has left the chat.
            break


def send(event=None):  # event is passed by binders.
    """Handles sending of messages."""
    msg = my_msg.get()
    my_msg.set("")  # Clears input field.
    if rsa.cont > 0:
        message = idea.get_encrypt_message(msg, idea.get_key())  
    
    client_socket.send(bytes(msg, "utf8"))

    if rsa.cont == 0:
        rsa.cont += 1
        print("chave publica ", rsa.get_public_key())
        print("chave privada", rsa.get_private_key())
        client_socket.send(bytes(rsa.get_public_key(), "utf8"))

    if msg == "{quit}":
        cont = 0
        client_socket.close()
        top.quit()


def on_closing(event=None):
    """This function is to be called when the window is closed."""
    my_msg.set("{quit}")
    send()

top = tkinter.Tk()
top.title("Chatter")

messages_frame = tkinter.Frame(top)
my_msg = tkinter.StringVar()  # For the messages to be sent.
my_msg.set("Escreva seu nome")
scrollbar = tkinter.Scrollbar(messages_frame)  # To navigate through past messages.
# Following will contain the messages.
msg_list = tkinter.Listbox(messages_frame, height=15, width=50, yscrollcommand=scrollbar.set)
scrollbar.pack(side=tkinter.RIGHT, fill=tkinter.Y)
msg_list.pack(side=tkinter.LEFT, fill=tkinter.BOTH)
msg_list.pack()
messages_frame.pack()

entry_field = tkinter.Entry(top, textvariable=my_msg)
entry_field.bind("<Return>", send)
entry_field.pack()
send_button = tkinter.Button(top, text="Send", command=send)
send_button.pack()

top.protocol("WM_DELETE_WINDOW", on_closing)

rsa = RSA()
idea = IDEA()

#----Setando configuraoes----
HOST = 'localhost' 
PORT = 33001

if not PORT:
    PORT = 33001
else:
    PORT = int(PORT)

BUFSIZ = 2*4096 
ADDR = (HOST, PORT)

client_socket = socket(AF_INET, SOCK_STREAM)
client_socket.connect(ADDR)

receive_thread = Thread(target=receive)
receive_thread.start()
tkinter.mainloop() 
