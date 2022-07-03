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

    // private static Boolean end = false;

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
                                daftarBarang.peek(4);
                                System.out.print("    Pilih barang: ");
                                int pilihBarang = add.sc().nextInt();
                                System.out.print("    Jumlah barang: ");
                                int jumlahBarang = add.sc().nextInt();
                                add.border();
                                int laporanHarga = 0;
                                switch (pilihBarang) {
                                    case 1:
                                        laporanHarga = tas.getHarga() * jumlahBarang;
                                        daftarTransaksi.enqueue(
                                                new cSimpul(
                                                        new cTransaksi(kodeTr,
                                                                namaPembeli,
                                                                tas,
                                                                jumlahBarang,
                                                                0,
                                                                laporanHarga,
                                                                0,
                                                                0,
                                                                false)));
                                        // add.sleep(2000);
                                        break;
                                    case 2:
                                        laporanHarga = sandal.getHarga() * jumlahBarang;
                                        daftarTransaksi.enqueue(
                                                new cSimpul(
                                                        new cTransaksi(kodeTr,
                                                                namaPembeli,
                                                                sandal,
                                                                jumlahBarang,
                                                                0,
                                                                laporanHarga,
                                                                0,
                                                                0,
                                                                false)));
                                        // add.sleep(2000);
                                        break;
                                    case 3:
                                        laporanHarga = sepatu.getHarga() * jumlahBarang;
                                        daftarTransaksi.enqueue(
                                                new cSimpul(
                                                        new cTransaksi(kodeTr,
                                                                namaPembeli,
                                                                sepatu,
                                                                jumlahBarang,
                                                                0,
                                                                laporanHarga,
                                                                0,
                                                                0,
                                                                false)));
                                        // add.sleep(2000);
                                        break;
                                    case 4:
                                        laporanHarga = baju.getHarga() * jumlahBarang;
                                        daftarTransaksi.enqueue(
                                                new cSimpul(
                                                        new cTransaksi(kodeTr,
                                                                namaPembeli,
                                                                baju,
                                                                jumlahBarang,
                                                                0,
                                                                laporanHarga,
                                                                0,
                                                                0,
                                                                false)));
                                        // add.sleep(2000);
                                        break;
                                    case 5:
                                        laporanHarga = celana.getHarga() * jumlahBarang;
                                        daftarTransaksi.enqueue(
                                                new cSimpul(
                                                        new cTransaksi(kodeTr,
                                                                namaPembeli,
                                                                celana,
                                                                jumlahBarang,
                                                                0,
                                                                laporanHarga,
                                                                0,
                                                                0,
                                                                false)));
                                        // add.sleep(2000);
                                        break;
                                    case 6:
                                        laporanHarga = kaos.getHarga() * jumlahBarang;
                                        daftarTransaksi.enqueue(
                                                new cSimpul(
                                                        new cTransaksi(kodeTr,
                                                                namaPembeli,
                                                                kaos,
                                                                jumlahBarang,
                                                                0,
                                                                laporanHarga,
                                                                0,
                                                                0,
                                                                false)));
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
                                daftarTransaksi.peek(namaPembeli);
                                add.sleep(2500);
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
                    kodeTr++;
                    add.cls();
                    add.border();
                    System.out.println("  Menu Anggota");
                    add.border();
                    System.out.print("  Masukkan username: ");
                    username = add.sc().next();
                    System.out.print("  Masukkan password: ");
                    password = add.sc().next();
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
                                    System.out.println("   Menu Tambah Barang [" + username + "]");
                                    daftarBarang.peek(4);
                                    System.out.print("    Pilih barang: ");
                                    int pilihBarang = add.sc().nextInt();
                                    System.out.print("    Jumlah barang: ");
                                    int jumlahBarang = add.sc().nextInt();
                                    add.border();
                                    int laporanHarga = 0;
                                    switch (pilihBarang) {
                                        case 1:
                                            laporanHarga = tas.getHarga() * jumlahBarang * 95 / 100;
                                            daftarTransaksi.enqueue(
                                                    new cSimpul(
                                                            new cTransaksi(kodeTr,
                                                                    Integer.toString(
                                                                            daftarMember.cariIdMember(username)),
                                                                    tas,
                                                                    jumlahBarang,
                                                                    0,
                                                                    laporanHarga,
                                                                    0,
                                                                    0,
                                                                    true)));
                                            break;
                                        case 2:
                                            laporanHarga = sandal.getHarga() * jumlahBarang * 95 / 100;
                                            daftarTransaksi.enqueue(
                                                    new cSimpul(
                                                            new cTransaksi(kodeTr,
                                                                    Integer.toString(
                                                                            daftarMember.cariIdMember(username)),
                                                                    sandal,
                                                                    jumlahBarang,
                                                                    0,
                                                                    laporanHarga,
                                                                    0,
                                                                    0,
                                                                    true)));
                                            // add.sleep(2000);
                                            break;
                                        case 3:
                                            laporanHarga = sepatu.getHarga() * jumlahBarang * 95 / 100;
                                            daftarTransaksi.enqueue(
                                                    new cSimpul(
                                                            new cTransaksi(kodeTr,
                                                                    Integer.toString(
                                                                            daftarMember.cariIdMember(username)),
                                                                    sepatu,
                                                                    jumlahBarang,
                                                                    0,
                                                                    laporanHarga,
                                                                    0,
                                                                    0,
                                                                    true)));
                                            // add.sleep(2000);
                                            break;
                                        case 4:
                                            laporanHarga = baju.getHarga() * jumlahBarang * 95 / 100;
                                            daftarTransaksi.enqueue(
                                                    new cSimpul(
                                                            new cTransaksi(kodeTr,
                                                                    Integer.toString(
                                                                            daftarMember.cariIdMember(username)),
                                                                    baju,
                                                                    jumlahBarang,
                                                                    0,
                                                                    laporanHarga,
                                                                    0,
                                                                    0,
                                                                    true)));
                                            // add.sleep(2000);
                                            break;
                                        case 5:
                                            laporanHarga = celana.getHarga() * jumlahBarang * 95 / 100;
                                            daftarTransaksi.enqueue(
                                                    new cSimpul(
                                                            new cTransaksi(kodeTr,
                                                                    Integer.toString(
                                                                            daftarMember.cariIdMember(username)),
                                                                    celana,
                                                                    jumlahBarang,
                                                                    0,
                                                                    laporanHarga,
                                                                    0,
                                                                    0,
                                                                    true)));
                                            // add.sleep(2000);
                                            break;
                                        case 6:
                                            laporanHarga = kaos.getHarga() * jumlahBarang * 95 / 100;
                                            daftarTransaksi.enqueue(
                                                    new cSimpul(
                                                            new cTransaksi(kodeTr,
                                                                    Integer.toString(
                                                                            daftarMember.cariIdMember(username)),
                                                                    kaos,
                                                                    jumlahBarang,
                                                                    0,
                                                                    laporanHarga,
                                                                    0,
                                                                    0,
                                                                    true)));
                                            // add.sleep(2000);
                                            break;
                                        default:
                                            System.out.println("    Barang tidak ditemukan");
                                            break;
                                    }
                                    break;
                                case 2:
                                    // hapus transaksi
                                    add.border();
                                    System.out.println("    Menu Penghapusan Barang [" + username + "]");
                                    add.border();
                                    daftarTransaksi.peek(kodeTr);
                                    System.out.print("    Barang yang dihapus (0 untuk batal): ");
                                    String barang = add.sc().next();
                                    if (barang.equals("0")) {
                                        break;
                                    } else {
                                        daftarTransaksi.cariHapusTransaksi(
                                                Integer.toString(daftarMember.cariIdMember(username)),
                                                barang);
                                    }
                                    add.sleep(4500);
                                    break;
                                case 3:
                                    // lihat transaksi
                                    daftarTransaksi.peek(Integer.toString(daftarMember.cariIdMember(username)));
                                    add.sleep(2500);
                                    break;
                                case 4:
                                    // Ubah password
                                    add.border();
                                    System.out.print("  Masukkan Password Lama: ");
                                    String oldPass = add.sc().next();
                                    boolean isFound = daftarMember.cariPassword(username, oldPass);
                                    add.sBorder();
                                    if (isFound == true) {
                                        System.out.print("  Masukkan Password Baru: ");
                                        String newPass = add.sc().next();
                                        daftarMember.setPassword(username, newPass);
                                        add.sBorder();
                                        System.out.println("  PASSWORD BERHASIL DIUBAH!");
                                    }
                                    add.sleep(2000);
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
                    // add.cls();
                    add.border();
                    System.out.println("  Login Menu Admin");
                    add.border();
                    System.out.print("  Masukkan username: ");
                    username = add.sc().next();
                    System.out.print("  Masukkan password: ");
                    password = add.sc().next();
                    if (username.equalsIgnoreCase(userAdmin) && password.equalsIgnoreCase(passAdmin)) {
                        do {
                            // add.cls();
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
                                            found = daftarTransaksi.ubahProsesTransaksi(kodeTr, found, daftarBarang,
                                                    daftarMember);
                                        }
                                        add.sleep(3500);
                                    } while (found == false);
                                    break;
                                case 3:
                                    System.out.println("    Kembali ke menu sebelumnya...");
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
                        } while (pilih2 != 3);
                    } else {
                        add.salahLogin();
                        // end = true;
                        add.sleep(2000);
                    }
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
                    // end = false;
                    if (username.equalsIgnoreCase(userPemilik) && password.equalsIgnoreCase(passPemilik)) {
                        do {
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
                            System.out.println("  2. Tampilkan Transaksi Sudah di Proses");
                            System.out.println("  3. Ubah Harga Barang"); // Akun Pemilik dapat mengubah harga barang
                                                                          // yang dijual. Pemilik terlebih dulu memilih
                                                                          // nama barang yang akan diubah harganya.
                            System.out.println("  4. Daftar Laporan Barang"); // Akun Pemilik dapat menampilkan daftar
                                                                              // laporan saat dipilih menu total nilai
                                                                              // penjualan harian untuk setiap jenis
                                                                              // barangnya.
                            System.out.println("  5. Daftar Laporan Member"); // Akun Pemilik dapat menampilkan daftar
                                                                              // total biaya belanja untuk pembeli yang
                                                                              // statusnya sebagai Member.
                            System.out.println("  6. Grafik Penjualan Barang"); // Akun Pemilik bisa melihat grafik
                                                                                // penjualan untuk setiap barang dalam
                                                                                // satu bulannya dengan skala puluhan
                                                                                // ribu (pembulatan ke bawah; diwakili
                                                                                // karakter “X” ke samping kanan)
                            System.out.println("  7. Kembali");
                            System.out.println("  8. Keluar");
                            System.out.print("  Pilih Menu = ");
                            pilih2 = add.sc().nextInt();
                            switch (pilih2) {
                                case 1:
                                    daftarTransaksi.peekStatus(0);
                                    add.sleep(2500);
                                    break;
                                case 2:
                                    daftarTransaksi.peekStatus(1);
                                    add.sleep(2500);
                                    break;
                                case 3:
                                    daftarBarang.peek(4);
                                    System.out.println("    Menu Mengubah Harga Barang");
                                    System.out.print("    Nama Barang: ");
                                    String namaBarang = add.sc().nextLine();
                                    daftarBarang.searchBarang(namaBarang);
                                    break;
                                case 4:
                                    daftarBarang.getLaporanBarang();
                                    add.sleep(2500);
                                    break;
                                case 5:
                                    daftarMember.getLaporanMember();
                                    add.sleep(2500);
                                    break;
                                case 6:
                                    daftarTransaksi.getGrafikPenjualan(daftarBarang.getHead());
                                    add.sleep(2500);
                                    break;
                                case 7:
                                    System.out.println("    Kembali ke menu sebelumnya...");
                                    add.sleep(2000);
                                    break;
                                case 8:
                                    add.exit();
                                    add.sleep(2000);
                                    break;
                                default:
                                    break;
                            }
                        } while (pilih2 != 7);
                    } else {
                        add.salahLogin();
                        add.sleep(2000);
                    }
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
}
