package com.shuyshuys.pasbp;

public class appToko {

    private static cBarang tas = new cBarang("Tas", 100000);
    private static cBarang sandal = new cBarang("Sandal", 50000);
    private static cBarang sepatu = new cBarang("Sepatu", 150000);
    private static cBarang baju = new cBarang("Baju", 250000);
    private static cBarang celana = new cBarang("Celana", 350000);
    private static cBarang kaos = new cBarang("Kaos", 450000);

    private static cDaftarMember daftarMember = new cDaftarMember();
    private static cDaftarBarang daftarBarang = new cDaftarBarang();

    static void data() {
        // daftarBarang.tambahBarang(tas);
        daftarBarang.enqueue(new cSimpul(tas));
        // daftarBarang.tambahBarang(sandal);
        daftarBarang.enqueue(new cSimpul(sandal));
        // daftarBarang.tambahBarang(sepatu);
        daftarBarang.enqueue(new cSimpul(sepatu));
        // daftarBarang.tambahBarang(baju);
        daftarBarang.enqueue(new cSimpul(baju));
        // daftarBarang.tambahBarang(celana);
        daftarBarang.enqueue(new cSimpul(celana));
        // daftarBarang.tambahBarang(kaos);
        daftarBarang.enqueue(new cSimpul(kaos));

        cMember budi = new cMember(101, "Budi", "budi");
        cMember siti = new cMember(102, "Siti", "siti");
        cMember sri = new cMember(103, "Sri", "sri");

        // daftarMember.tambahMember(budi);
        daftarMember.enqueue(new cSimpul(budi));
        // daftarMember.tambahMember(siti);
        daftarMember.enqueue(new cSimpul(siti));
        // daftarMember.tambahMember(sri);
        daftarMember.enqueue(new cSimpul(sri));
    }

    private static Boolean end = false;

    private static int kodeTr = 200;
    private static String username, password;

    private static String userAdmin = "admin";
    private static String passAdmin = "admin";

    private static String userPemilik = "pemilik";
    private static String passPemilik = "pemilik";

    public static void main(String[] args) {
        // add.cls();
        data();

        cDaftarTransaksi daftarTransaksi = new cDaftarTransaksi();
        int pilih = 0, pilih2 = 0;
        // add.sleep(2000);
        do {
            // add.cls();
            add.border();
            System.out.println("Menu level pengguna");
            add.border();
            System.out.println("1. Pembeli");
            System.out.println("2. Anggota / Member");
            System.out.println("3. Admin");
            System.out.println("4. Pemilik");
            System.out.println("5. Anggota Kelompok");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu = ");
            pilih = add.sc().nextInt();
            switch (pilih) {
                case 1:
                    // Pembeli
                    // Pembeli : diikuti pengisian data nama
                    // add.cls();
                    kodeTr++;
                    add.border();
                    System.out.println("  Menu Pembeli");
                    add.border();
                    System.out.print("  Masukkan nama pembeli: ");
                    String namaPembeli = add.sc().next();
                    do {
                        // add.cls();
                        add.border();
                        System.out.println("  Pembeli [" + namaPembeli + "]");
                        add.border();
                        System.out.println("  1. Tambah Transaksi");
                        System.out.println("  2. Hapus Transaksi");
                        System.out.println("  3. Lihat Transaksi");
                        System.out.println("  4. Bayar Transaksi");
                        System.out.println("  5. Kembali");
                        System.out.println("  6. Keluar");
                        System.out.print("  Pilih menu = ");
                        pilih2 = add.sc().nextInt();
                        switch (pilih2) {
                            case 1:
                                add.border();
                                System.out.println("    Menu Tambah Barang [" + namaPembeli + "]");
                                // add.border();
                                // printBarang();
                                // daftarBarang.lihatBarang();
                                daftarBarang.peek(4);
                                // add.border();
                                System.out.print("    Pilih barang: ");
                                int pilihBarang = add.sc().nextInt();
                                System.out.print("    Jumlah barang: ");
                                int jumlahBarang = add.sc().nextInt();
                                add.border();
                                int laporanHarga = 0;
                                switch (pilihBarang) {
                                    case 1:
                                        laporanHarga = tas.getHarga() * jumlahBarang;
                                        daftarBarang.setLaporanHarga("tas", laporanHarga);
                                        daftarTransaksi.enqueue(
                                                new cSimpul(
                                                        new cTransaksi(kodeTr,
                                                                namaPembeli,
                                                                tas,
                                                                jumlahBarang,
                                                                0,
                                                                laporanHarga,
                                                                0,
                                                                0)));
                                        // add.sleep(2000);
                                        break;
                                    case 2:
                                        laporanHarga = sandal.getHarga() * jumlahBarang;
                                        daftarBarang.setLaporanHarga("sandal", laporanHarga);
                                        daftarTransaksi.enqueue(
                                                new cSimpul(
                                                        new cTransaksi(kodeTr,
                                                                namaPembeli,
                                                                sandal,
                                                                jumlahBarang,
                                                                0,
                                                                laporanHarga,
                                                                0,
                                                                0)));
                                        // add.sleep(2000);
                                        break;
                                    case 3:
                                        laporanHarga = sepatu.getHarga() * jumlahBarang;
                                        daftarBarang.setLaporanHarga("sepatu", laporanHarga);
                                        daftarTransaksi.enqueue(
                                                new cSimpul(
                                                        new cTransaksi(kodeTr,
                                                                namaPembeli,
                                                                sepatu,
                                                                jumlahBarang,
                                                                0,
                                                                laporanHarga,
                                                                0,
                                                                0)));
                                        // add.sleep(2000);
                                        break;
                                    case 4:
                                        laporanHarga = baju.getHarga() * jumlahBarang;
                                        daftarBarang.setLaporanHarga("baju", laporanHarga);
                                        daftarTransaksi.enqueue(
                                                new cSimpul(
                                                        new cTransaksi(kodeTr,
                                                                namaPembeli,
                                                                baju,
                                                                jumlahBarang,
                                                                0,
                                                                laporanHarga,
                                                                0,
                                                                0)));
                                        // add.sleep(2000);
                                        break;
                                    case 5:
                                        laporanHarga = celana.getHarga() * jumlahBarang;
                                        daftarBarang.setLaporanHarga("celana", laporanHarga);
                                        daftarTransaksi.enqueue(
                                                new cSimpul(
                                                        new cTransaksi(kodeTr,
                                                                namaPembeli,
                                                                celana,
                                                                jumlahBarang,
                                                                0,
                                                                laporanHarga,
                                                                0,
                                                                0)));
                                        // add.sleep(2000);
                                        break;
                                    case 6:
                                        laporanHarga = kaos.getHarga() * jumlahBarang;
                                        daftarBarang.setLaporanHarga("kaos", laporanHarga);
                                        daftarTransaksi.enqueue(
                                                new cSimpul(
                                                        new cTransaksi(kodeTr,
                                                                namaPembeli,
                                                                kaos,
                                                                jumlahBarang,
                                                                0,
                                                                laporanHarga,
                                                                0,
                                                                0)));
                                        // add.sleep(2000);
                                        break;
                                    default:
                                        System.out.println("    Barang tidak ditemukan");
                                        break;
                                }
                                break;
                            case 2:
                                add.border();
                                System.out.println("    Menu Penghapusan Barang [" + namaPembeli + "]");
                                add.border();
                                daftarTransaksi.peek(kodeTr);
                                System.out.print("    Barang yang dihapus (0 untuk batal): ");
                                String barang = add.sc().next();
                                if (barang.equals("0")) {
                                    break;
                                } else {
                                    daftarTransaksi.cariHapusTransaksi(namaPembeli, barang);
                                }
                                add.sleep(4500);
                                break;
                            case 3:
                                add.border();
                                daftarTransaksi.peek(namaPembeli);
                                add.border();
                                add.sleep(2000);
                                break;
                            case 4:
                                add.border();
                                System.out.println("    Menu Pembayaran [" + namaPembeli + "]");
                                add.border();
                                System.out.println("    1. Tunai");
                                System.out.println("    2. Kembali");
                                System.out.println("    3. Keluar");
                                System.out.print("    Pilih menu = ");
                                pilih2 = add.sc().nextInt();
                                switch (pilih2) {
                                    case 1:
                                        add.border();
                                        System.out.println("      Pembayaran Tunai");
                                        add.border();
                                        daftarTransaksi.peek(namaPembeli);
                                        add.border();
                                        System.out.println("      Total tagihan anda = " +
                                                daftarTransaksi.totalTagihanPembeli(namaPembeli));
                                        System.out.print("      Masukkan uang: ");
                                        int uang = add.sc().nextInt();
                                        add.border();
                                        System.out.println("      Transaksi berhasil");
                                        System.out.println("      Kembalian = " +
                                                (uang - daftarTransaksi.totalTagihanPembeli(namaPembeli)));

                                        add.sleep(2000);
                                        break;
                                    case 2:
                                        System.out.println("      Kembali ke menu sebelumnya...");
                                        add.sleep(2000);
                                        break;
                                    case 3:
                                        add.exit();
                                        break;
                                    default:
                                        System.out.println("      Menu tidak ditemukan");
                                        break;
                                }
                                break;
                            case 5:
                                System.out.println("    Kembali ke menu sebelumnya...");
                                add.sleep(2000);
                                break;
                            case 6:
                                add.exit();
                                add.sleep(2000);
                                break;
                            default:
                                add.salahInput();
                                add.sleep(2000);
                                break;
                        }
                    } while (pilih2 != 5);
                    break;
                case 2:
                    // Anggota
                    // Member/anggota : diikuti pengisian login ID dan password. Untuk sebagai
                    // contoh, bisa disiapkan 3 akun anggota terlebih dulu
                    add.cls();
                    add.border();
                    System.out.println("\n  Menu Anggota");
                    add.border();
                    System.out.print("  Masukkan username: ");
                    username = add.sc().next();
                    System.out.print("  Masukkan password: ");
                    password = add.sc().next();
                    add.border();
                    if (daftarMember.cariMember(username, password) == true) {
                        do {
                            add.border();
                            System.out.println("  Selamat datang [" + username + "]");
                            add.border();
                            System.out.println("  Menu Anggota");
                            System.out.println("  1. Tambah Transaksi");
                            System.out.println("  2. Hapus Transaksi");
                            System.out.println("  3. Lihat Transaksi");
                            System.out.println("  4. Ubah Password");
                            System.out.println("  5. Kembali");
                            System.out.println("  6. Keluar");
                            System.out.print("  Pilih menu = ");
                            pilih2 = add.sc().nextInt();
                            switch (pilih2) {
                                case 1:
                                    // tambah transaksi

                                    break;
                                case 2:
                                    // hapus transaksi

                                    break;
                                case 3:
                                    // lihat transaksi

                                    break;
                                case 4:
                                    // Ubah password

                                    break;
                                case 5:
                                    System.out.println("  Kembali ke menu sebelumnya...");
                                    add.sleep(2000);
                                    break;
                                case 6:
                                    add.exit();
                                    add.sleep(2000);
                                    break;
                                default:
                                    add.salahInput();
                                    add.sleep(2000);
                                    break;
                            }
                        } while (pilih2 != 5);
                    } else {
                        add.salahLogin();
                        add.sleep(2000);
                    }

                    break;
                case 3:
                    // Admin
                    // Admin : diikuti dengan pengisian password.
                    add.cls();
                    add.border();
                    System.out.println("  Login Menu Admin");
                    add.border();
                    System.out.print("  Masukkan username: ");
                    username = add.sc().next();
                    System.out.print("  Masukkan password: ");
                    password = add.sc().next();
                    do {
                        if (username.equalsIgnoreCase(userAdmin) && password.equalsIgnoreCase(passAdmin)) {
                            add.cls();
                            add.border();
                            System.out.println("  Menu Admin [" + username + "]");
                            add.border();
                            System.out.println("  1. List Barang");
                            System.out.println("  2. Mengganti status transaksi");
                            System.out.println("  3. Kembali");
                            System.out.println("  4. Keluar");
                            System.out.print("  Pilih menu = ");
                            pilih2 = add.sc().nextInt();
                            switch (pilih2) {
                                case 1:
                                    daftarTransaksi.peek();
                                    add.sleep(3000);
                                    break;
                                case 2:
                                    // proses transaksi
                                    Boolean found = false;
                                    do {
                                        // add.cls();
                                        add.border();
                                        System.out.println("    --- Ubah Proses transaksi ---");
                                        add.border();
                                        daftarTransaksi.peek();
                                        add.border();
                                        System.out.print("    Kode Transaksi '0 untuk batal': ");
                                        kodeTr = add.sc().nextInt();
                                        if (kodeTr == 0) {
                                            found = true;
                                        } else {
                                            found = daftarTransaksi.ubahProsesTransaksi(kodeTr, found);
                                        }
                                        add.sleep(4500);
                                    } while (found == false);
                                    break;
                                case 3:
                                    System.out.println("    Kembali ke menu sebelumnya...");
                                    end = true;
                                    add.sleep(2000);
                                    break;
                                case 4:
                                    add.exit();
                                    add.sleep(2000);
                                    break;
                                default:
                                    add.salahInput();
                                    break;
                            }
                        } else {
                            add.salahLogin();
                            end = true;
                            add.sleep(2000);
                        }
                    } while (end == false);
                    break;
                case 4:
                    // Pemilik
                    // Pemilik : diikuti dengan pengisian password.
                    // add.cls();
                    add.border();
                    System.out.println("  Login Menu Pemilik");
                    add.border();
                    System.out.print("  Masukkan username: ");
                    username = add.sc().next();
                    System.out.print("  Masukkan password: ");
                    password = add.sc().next();
                    end = false;
                    do {
                        if (username.equalsIgnoreCase(userPemilik) && password.equalsIgnoreCase(passPemilik)) {
                            // add.cls();
                            add.border();
                            System.out.println("  Menu Pemilik [" + userPemilik + "]");
                            add.border();
                            System.out.println("  1. Tampilkan Transaksi Belum di Proses"); // Akun Admin dapat
                                                                                            // menampilkan seluruh data
                                                                                            // transaksi pembelian
                                                                                            // barang yang belum
                                                                                            // diproses beserta jumlah
                                                                                            // transaksinya.
                            System.out.println("  2. Ubah Harga Barang"); // Akun Pemilik dapat mengubah harga barang
                                                                          // yang dijual. Pemilik terlebih dulu memilih
                                                                          // nama barang yang akan diubah harganya.
                            System.out.println("  3. Daftar Laporan Barang"); // Akun Pemilik dapat menampilkan daftar
                                                                              // laporan saat dipilih menu total nilai
                                                                              // penjualan harian untuk setiap jenis
                                                                              // barangnya.
                            System.out.println("  4. Daftar Laporan Member"); // Akun Pemilik dapat menampilkan daftar
                                                                              // total biaya belanja untuk pembeli yang
                                                                              // statusnya sebagai Member.
                            System.out.println("  5. Grafik Penjualan Barang"); // Akun Pemilik bisa melihat grafik
                                                                                // penjualan untuk setiap barang dalam
                                                                                // satu bulannya dengan skala puluhan
                                                                                // ribu (pembulatan ke bawah; diwakili
                                                                                // karakter “X” ke samping kanan)
                            System.out.println("  6. Kembali");
                            System.out.print("Pilih Menu = ");
                            pilih = add.sc().nextInt();
                            switch (pilih) {
                                case 1:
                                    daftarTransaksi.peekStatus(0);
                                    break;
                                case 2:
                                    daftarBarang.peek(4);
                                    System.out.println("    Menu Mengubah Harga Barang");
                                    System.out.print("    Nama Barang: ");
                                    String namaBarang = add.sc().nextLine();
                                    daftarBarang.searchBarang(namaBarang);
                                    break;
                                case 3:
                                    daftarBarang.getLaporanBarang();
                                    break;
                                case 4:
                                    daftarBarang.getLaporanMember();
                                    break;
                                case 5:
                                    daftarTransaksi.getGrafikPenjualan(daftarBarang.getHead());
                                    break;
                                case 6:
                                    System.out.println("    Kembali ke menu sebelumnya...");
                                    end = true;
                                    add.sleep(2000);
                                    break;
                                default:
                                    break;
                            }
                        } else {
                            add.salahLogin();
                            add.sleep(2000);
                        }
                    } while (end == false);
                    break;
                case 5:
                    add.cls();
                    add.namaKelompok();
                    add.sleep(6000);
                    break;
                case 6:
                    // Keluar
                    add.exit();
                    add.sleep(2000);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }

        } while (pilih != 6);
        add.sc().close();
    }

    // static void printBarang() {
    // System.out.println(" 1. [" + tas.getNama() + "]\t[" + tas.getHarga() + "]");
    // System.out.println(" 2. [" + sandal.getNama() + "]\t[" + sandal.getHarga() +
    // "]");
    // System.out.println(" 3. [" + sepatu.getNama() + "]\t[" + sepatu.getHarga() +
    // "]");
    // System.out.println(" 4. [" + baju.getNama() + "]\t[" + baju.getHarga() +
    // "]");
    // System.out.println(" 5. [" + celana.getNama() + "]\t[" + celana.getHarga() +
    // "]");
    // System.out.println(" 6. [" + kaos.getNama() + "]\t[" + kaos.getHarga() +
    // "]");
    // for (cSimpul s = head; s != null; s = s.next) {

    // }
    // }
}
