package com.shuyshuys.pasbp;

public class appToko {
    // Variable untuk menampung data berupa linkedlist
    private static cDaftarMember daftarMember = new cDaftarMember();
    private static cDaftarBarang daftarBarang = new cDaftarBarang();
    private static cDaftarTransaksi daftarTransaksi = new cDaftarTransaksi();
    private static cDaftarTransaksi tempDaftarTransaksi = new cDaftarTransaksi();
    // Variable untuk menulis dan membaca data ke database
    private static mineWriter write = new mineWriter();
    private static mineReader reader = new mineReader();
    // Variable kode transaksi
    private static int kodeTr = 200;
    // Variable menampung inputan login dari pengguna
    private static String username, password;
    // Variable default user dan pass akun administrator
    private static String userAdmin = "admin";
    private static String passAdmin = "admin";
    // Variable default user dan pass akun pemilik
    private static String userPemilik = "pemilik";
    private static String passPemilik = "pemilik";

    static void initData() {
        // Mengambil data transaksi dari database kemudian
        // dimasukkan ke dalam linkedlist daftar transaksi
        reader.getTransaksiFromDB(daftarTransaksi);
        // Mengambil data barang dari database kemudian
        // dimasukkan ke dalam linkedlist daftar barang
        reader.getBarangFromDB(daftarBarang);
        // Mengambil data member dari database kemudian
        // dimasukkan ke dalam linkedlist daftar member
        reader.getMemberFromDB(daftarMember);
        // Mengupdate kode transaksi disesuaikan dengan data terakhir dari databse
        kodeTr = reader.updateKodeTr();
    }

    public static void main(String[] args) {
        System.out.println(System.lineSeparator().repeat(100));
        add.cls();
        initData();
        // Variable menampung input pilihan user
        int pilih = 0, pilih2 = 0, pilih3 = 0;
        do {
            // add.cls();
            add.border();
            System.out.println("MENU LEVEL PENGGUNA");
            add.border();
            System.out.println("1. Pembeli");
            System.out.println("2. Anggota / Member");
            System.out.println("3. Administrator");
            System.out.println("4. Pemilik");
            System.out.println("5. Anggota Kelompok");
            System.out.println("6. Keluar Aplikasi");
            System.out.print("Pilih menu = ");
            pilih = add.sc().nextInt();
            switch (pilih) {
                case 1:
                    // Menu Pembeli : diikuti dengan pengisian data nama
                    add.cls();
                    kodeTr++;
                    add.border();
                    System.out.println("  MENU PEMBELI");
                    add.border();
                    System.out.print("  Masukkan nama pembeli: ");
                    String namaPembeli = add.sc().next();
                    do {
                        add.border();
                        System.out.println("  Pembeli [" + namaPembeli + "] [" + kodeTr + "]");
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
                                add.cls();
                                add.border();
                                System.out.println("    Menu Tambah Barang [" + namaPembeli + "]");
                                daftarBarang.peek(4);
                                System.out.print("    Nama Barang: ");
                                int pilihBarang = add.sc().nextInt();
                                System.out.print("    Jumlah barang: ");
                                int jumlahBarang = add.sc().nextInt();
                                add.sBorder();
                                // Dari variable pilihBarang dan jumlahBarang akan didapatkan cBarang
                                cBarang barangTerpilih = daftarBarang.cariBarangInt(pilihBarang);
                                // Kemudian akan dimasukkan pada linkedlist daftarTransaksi
                                tempDaftarTransaksi.beli(kodeTr,
                                        namaPembeli,
                                        barangTerpilih,
                                        jumlahBarang,
                                        daftarTransaksi,
                                        false);

                                // daftarTransaksi.beli(kodeTr, namaPembeli, barangTerpilih, jumlahBarang,
                                // daftarTransaksi, false);
                                // Data transaksi dimasukkan pula pada database
                                write.setTransaksiToDB(kodeTr, namaPembeli, barangTerpilih, jumlahBarang, 0, 0,
                                        0, false);
                                break;
                            case 2:
                                add.cls();
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
                                    write.deleteTransaksi(namaPembeli, barang);
                                }
                                add.sleep(4000);
                                break;
                            case 3:
                                add.cls();
                                daftarTransaksi.peek(namaPembeli);
                                add.sleep(2500);
                                break;
                            case 4:
                                add.cls();
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
                                                daftarTransaksi.totalTagihan(namaPembeli));
                                        System.out.print("      Masukkan uang: ");
                                        int uang = add.sc().nextInt();
                                        add.border();
                                        System.out.println("      Transaksi berhasil");
                                        System.out.println("      Kembalian = " +
                                                (uang - daftarTransaksi.totalTagihan(namaPembeli)));

                                        add.sleep(2500);
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
                                add.cls();
                                System.out.println("    Kembali ke menu sebelumnya...");
                                daftarTransaksi.sambungTransaksi(daftarTransaksi, tempDaftarTransaksi);
                                add.sleep(2000);
                                break;
                            case 6:
                                add.exit();
                                add.sleep(2000);
                                break;
                            default:
                                add.cls();
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
                    kodeTr++;
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
                            System.out.println("  Selamat datang [" + username + "] [" + kodeTr + "]");
                            add.border();
                            System.out.println("  Menu Anggota");
                            System.out.println("  1. Tambah Transaksi");
                            System.out.println("  2. Hapus Transaksi");
                            System.out.println("  3. Lihat Transaksi");
                            System.out.println("  4. Ubah Password");
                            System.out.println("  5. Bayar");
                            System.out.println("  6. Kembali");
                            System.out.println("  7. Keluar");
                            System.out.print("  Pilih menu = ");
                            pilih2 = add.sc().nextInt();
                            switch (pilih2) {
                                case 1:
                                    // tambah transaksi
                                    add.cls();
                                    System.out.println("   Menu Tambah Barang [" + username + "]");
                                    daftarBarang.peek(4);
                                    System.out.print("    Pilih barang: ");
                                    // String namaBarang = add.sc().nextLine();
                                    int pilihBarang = add.sc().nextInt();
                                    System.out.print("    Jumlah barang: ");
                                    int jumlahBarang = add.sc().nextInt();
                                    add.border();
                                    cBarang barangTerpilih = daftarBarang.cariBarangInt(pilihBarang);

                                    tempDaftarTransaksi.beli(kodeTr,
                                            username,
                                            barangTerpilih,
                                            jumlahBarang,
                                            daftarTransaksi,
                                            true);

                                    write.setTransaksiToDB(kodeTr,
                                            Integer.toString(daftarMember.cariIdMember(username)),
                                            barangTerpilih,
                                            jumlahBarang,
                                            0, 0, 0, true);

                                    // daftarTransaksi.beli(kodeTr,
                                    // Integer.toString(daftarMember.cariIdMember(username)), barangTerpilih,
                                    // jumlahBarang, daftarTransaksi, true);

                                    break;
                                case 2:
                                    // hapus transaksi
                                    add.cls();
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
                                        write.deleteTransaksi(
                                                Integer.toString(daftarMember.cariIdMember(username)),
                                                barang);
                                    }
                                    add.sleep(4500);
                                    break;
                                case 3:
                                    // lihat transaksi
                                    add.cls();
                                    daftarTransaksi.peek(Integer.toString(daftarMember.cariIdMember(username)));
                                    add.sleep(2500);
                                    break;
                                case 4:
                                    // Ubah password
                                    add.cls();
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
                                    add.sleep(2500);
                                    break;
                                case 5:
                                    add.cls();
                                    add.border();
                                    System.out.println("    Menu Pembayaran [" + username + "]");
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
                                            daftarTransaksi.peek(kodeTr);
                                            add.border();
                                            System.out.println("      Total tagihan anda = " +
                                                    daftarTransaksi.totalTagihan(username));
                                            System.out.print("      Masukkan uang: ");
                                            int uang = add.sc().nextInt();
                                            add.border();
                                            System.out.println("      Transaksi berhasil");
                                            int kembalian = uang - daftarTransaksi.totalTagihan(username);
                                            System.out.println("      Kembalian = " + kembalian);
                                            daftarTransaksi.setBayar(uang, kembalian, kodeTr);
                                            write.setBayarToDB(uang, kembalian, kodeTr);
                                            add.sleep(2500);
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
                                case 6:
                                    add.cls();
                                    System.out.println("  Kembali ke menu sebelumnya...");
                                    daftarTransaksi.sambungTransaksi(daftarTransaksi, tempDaftarTransaksi);
                                    add.sleep(2000);
                                    break;
                                case 7:
                                    add.exit();
                                    add.sleep(2000);
                                    break;
                                default:
                                    add.cls();
                                    add.salahInput();
                                    add.sleep(2000);
                                    break;
                            }
                        } while (pilih2 != 6);
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
                    if (username.equalsIgnoreCase(userAdmin) && password.equalsIgnoreCase(passAdmin)) {
                        do {
                            add.border();
                            System.out.println("  Menu Admin [" + username + "]");
                            add.border();
                            System.out.println("  1. List Transaksi");
                            System.out.println("  2. Menu Member");
                            System.out.println("  3. Mengganti status transaksi");
                            System.out.println("  4. Menghapus transaksi");
                            System.out.println("  5. Kembali");
                            System.out.println("  6. Keluar");
                            System.out.print("  Pilih menu = ");
                            pilih2 = add.sc().nextInt();
                            switch (pilih2) {
                                case 1:
                                    add.cls();
                                    daftarTransaksi.peek();
                                    add.sleep(3000);
                                    break;
                                case 2:
                                    do {
                                        add.cls();
                                        add.sBorder();
                                        System.out.println("    Menu Admin Member");
                                        System.out.println("    1. Lihat Member");
                                        System.out.println("    2. Tambah Member");
                                        System.out.println("    3. Kembali");
                                        System.out.print("    Pilih menu = ");
                                        pilih3 = add.sc().nextInt();
                                        if (pilih3 == 1) {
                                            daftarMember.peek();
                                        } else if (pilih3 == 2) {
                                            System.out.print("    Nama Member: ");
                                            String newMem = add.sc().next();
                                            System.out.print("    Password Member: ");
                                            String newPass = add.sc().next();
                                            int newId = daftarMember.tail.getIDMember() + 1;
                                            cMember m = new cMember(newId, newMem, newPass);
                                            daftarMember.enqueue(new cSimpul(m));
                                            write.setMemberToDB(newId, newMem, newPass);
                                        }
                                        add.sleep(2500);
                                    } while (pilih3 != 3);
                                    break;
                                case 3:
                                    // Mengubah status transaksi
                                    add.cls();
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
                                        add.sleep(2500);
                                    } while (found == false);
                                    break;
                                case 4:
                                    add.cls();
                                    daftarTransaksi.peek();
                                    add.sBorder();
                                    System.out.print("    Kode Transaksi: ");
                                    int kodeTransaksi = add.sc().nextInt();
                                    daftarTransaksi.peek(kodeTransaksi);
                                    System.out.print("Ubah status transaksi? (y/n): ");
                                    String jawab = add.sc().nextLine();
                                    add.sBorder();
                                    // Pengecekan ulang sebelum dilakukan pengubahan status transaksi
                                    if (jawab.equalsIgnoreCase("y")) {
                                        daftarTransaksi.hapusTransaksi(kodeTransaksi);
                                        write.deleteTransaksi(kodeTransaksi);
                                    } else {
                                        System.out.println("Transaksi tidak jadi dihapus!");
                                    }
                                    break;
                                case 5:
                                    add.cls();
                                    System.out.println("    Kembali ke menu sebelumnya...");
                                    add.sleep(2000);
                                    break;
                                case 6:
                                    add.exit();
                                    add.sleep(2000);
                                    break;
                                default:
                                    add.cls();
                                    add.salahInput();
                                    break;
                            }
                        } while (pilih2 != 5);
                    } else {
                        add.salahLogin();
                        add.sleep(2000);
                    }
                    break;
                case 4:
                    // Pemilik
                    // Pemilik : diikuti dengan pengisian password.
                    add.cls();
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
                                    add.cls();
                                    daftarTransaksi.peekStatus(0);
                                    add.sleep(2500);
                                    break;
                                case 2:
                                    add.cls();
                                    daftarTransaksi.peekStatus(1);
                                    add.sleep(2500);
                                    break;
                                case 3:
                                    add.cls();
                                    daftarBarang.peek(4);
                                    System.out.println("    Menu Mengubah Harga Barang");
                                    System.out.print("    Nama Barang: ");
                                    String namaBarang = add.sc().nextLine();
                                    daftarBarang.ubahHargaBarang(namaBarang);
                                    break;
                                case 4:
                                    add.cls();
                                    daftarBarang.getLaporanBarang();
                                    add.sleep(2500);
                                    break;
                                case 5:
                                    add.cls();
                                    daftarMember.getLaporanMember();
                                    add.sleep(2500);
                                    break;
                                case 6:
                                    add.cls();
                                    daftarTransaksi.getGrafikPenjualan(daftarBarang.getHead());
                                    add.sleep(2500);
                                    break;
                                case 7:
                                    add.cls();
                                    System.out.println("    Kembali ke menu sebelumnya...");
                                    add.sleep(2000);
                                    break;
                                case 8:
                                    add.exit();
                                    add.sleep(2000);
                                    break;
                                default:
                                    add.cls();
                                    add.salahInput();
                                    break;
                            }
                        } while (pilih2 != 7);
                    } else {
                        add.salahLogin();
                        add.sleep(2000);
                    }
                    break;
                case 5:
                    // Menampilkan nama kelompok
                    add.cls();
                    add.namaKelompok();
                    add.sleep(4500);
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
