import kivy
from kivy.animation import Animation
from kivy.app import App
from kivy.core.window import Window
from kivy.uix.widget import Widget
from kivy.uix.floatlayout import FloatLayout
from kivy.properties import NumericProperty
from kivy.uix.label import Label
from kivy.core.window import Window
from kivy.uix.popup import Popup
from kivy.uix.textinput import TextInput
from kivy.uix.button import Button
from kivy.uix.behaviors.button import ButtonBehavior
from kivy.uix.boxlayout import BoxLayout
from kivy.uix.screenmanager import ScreenManager, Screen


kivy.require('1.11.1')
Window.size = (1024, 600)

class MainScreen(Screen):
    '''
    def __init__(self, **kwargs):
        super().__init__(**kwargs)
    '''
    def write_message(self):
        text_message = self.ids.text_message
        self.send(text_message.text)
        text_message.text = ''

    def send(self, text_message):
        message_list = self.ids.message_list
        label = MyLabel(text_message)

        message_list.add_widget(label)

class InitialScreen(Screen):
    pass

class ContactScreen(Screen):
    pass

class MyLabel(Label):
    def __init__(self, text='', **kwargs):
        super().__init__(**kwargs)
        self.text = text

class ScreenManagement(ScreenManager):
    def to_main(self):
        self.current = 'mainPage'
    def to_initial(self):
        self.current = 'initialPage'
    def to_contact(self):
        self.current = 'contactPage'

class ViewApp(App):
    def build(self):
        root = ScreenManagement()
        return root

if __name__ == '__main__':
    ViewApp().run()
