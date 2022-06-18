package PrakRental; //Siti Waheeda Najihah 215150701111046

public class Mobil {

    private String carType;
    private String polNum;
    private String merk;
    private boolean status;

    public Mobil(String carType, String polNum, String merk, boolean status) {
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = status;
    }

    public String getCarType() {
        return carType;
    }

    public String getPolNum() {
        return polNum;
    }

    public String getMerk() {
        return merk;
    }

    public boolean getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        if (status == "true") {
            System.out.println("MOBIL BERHASIL DISEWA");
        } else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }

    public static void status() {
        Mobil.setStatus("true");
        Mobil.setStatus("false");
        Mobil.setStatus("true");
        Mobil.setStatus("false");
    }
}
