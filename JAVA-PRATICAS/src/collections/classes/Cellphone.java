/**
 * By Diogo Duarte on 16/01/2018
 * Collections
 */
package collections.classes;

public class Cellphone {
    private String name;
    private String IMEI;
    public Cellphone(String name, String IMEI){
        this.name = name;
        this.IMEI = IMEI;
    }
    @Override
    public boolean equals(Object object){
        if(object == null) return false;
        if(this == object) return true;
        if(this.getClass() != object.getClass()) return false;
        Cellphone anotherCellphone = (Cellphone) object;
        return IMEI != null && IMEI.equals(anotherCellphone.getIMEI());
    }
    @Override
    public int hashCode(){
        return IMEI != null ? IMEI.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Cellphone{" +
                "name='" + name + '\'' +
                ", IMEI='" + IMEI + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
