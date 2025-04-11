class RekeningBank {

        private String nomorRekening;
        private String namaPemilik;
        private double saldo;


        public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
                this.nomorRekening = nomorRekening;
                this.namaPemilik = namaPemilik;
                this.saldo = saldo;
        }


        public void tampilkanInfo() {
                System.out.println("Nomor Rekening: " + nomorRekening);
                System.out.println("Nama Pemilik: " + namaPemilik);
                System.out.println("Saldo: Rp" + saldo);
                System.out.println();
        }


        public void setorUang(double jumlah) {
                if (jumlah > 0) {
                        saldo += jumlah;
                        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
                } else {
                        System.out.println("Jumlah setor harus lebih dari 0.");
                }
        }


        public void tarikUang(double jumlah) {
                if (jumlah > saldo) {
                        System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
                } else if (jumlah > 0) {
                        saldo -= jumlah;
                        System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
                } else {
                        System.out.println("Jumlah tarik harus lebih dari 0.");
                }
        }
}


public class codelab2 {
        public static void main(String[] args) {

                RekeningBank rekening1 = new RekeningBank("1122334455", "Gatot", 500000);
                RekeningBank rekening2 = new RekeningBank("6677889910", "bagus", 1000000);


                rekening1.tampilkanInfo();
                rekening2.tampilkanInfo();


                rekening1.setorUang(200000);
                rekening2.setorUang(500000);


                rekening1.tarikUang(800000);
                rekening2.tarikUang(300000);


                System.out.println();
                rekening1.tampilkanInfo();
                rekening2.tampilkanInfo();
        }
}