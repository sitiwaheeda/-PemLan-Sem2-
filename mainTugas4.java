package Tugas4; //siti waheeda najihah_215150701111046

public class mainTugas4 {
    public static void main(String[] args) {

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid","Bakso",8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mbelebes","Nasi Goreng Jawa",10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros","Ayam Kota Ekstra Nasi",10000));
        DataMerchant.tampilanData();

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(DataMerchant.input.nextLine(), DataMerchant.input.nextLine(), DataMerchant.input.nextDouble()));
        DataMerchant.tampilanData();

    }
}
