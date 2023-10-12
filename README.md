# postest2pbo
## Nama : Syahfi Rizqi
## NIM  : 2209116093

## A.Penjelasan Tentang Class Bag
![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/fab6203c-c174-4054-b05f-41352d23da93)


Kode ini mendefinisikan paket (package) tempat kelas Bag berada, yaitu dalam paket Project.Bag.
Selain itu, kode ini mengimpor kelas DecimalFormat dari paket java.text, yang nantinya digunakan untuk memformat harga dalam bentuk mata uang.
Kode ini mendeklarasikan kelas Bag. Kata kunci public berarti kelas ini dapat diakses dari luar paket, dan kata kunci final menunjukkan bahwa kelas ini tidak dapat diwariskan.
Kode ini mendefinisikan tiga variabel anggota (atau properti) yang dimiliki oleh objek dari kelas Bag. Variabel name dan merk adalah string yang bersifat final (tidak dapat diubah setelah diinisialisasi),
sedangkan price adalah bilangan desimal (double).
![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/44e111fd-78d1-4de8-9b44-f479a07d5b8c)


Ini adalah konstruktor kelas Bag, yang digunakan untuk membuat objek Bag dengan menginisialisasi nilai dari name, merk, dan price sesuai dengan parameter yang diberikan.
metode getter yang digunakan untuk mengakses nilai dari name, merk, dan price. Metode-metode ini mengembalikan nilai dari variabel anggota tersebut.
![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/17ca2ade-53be-4285-9189-4fe5f14d2aae)

Metode toString() digunakan untuk menghasilkan representasi string dari objek Bag. Ini mencakup nama (name), merek (merk), dan harga (price) yang diformat dalam mata uang Rupiah

## B.Penjelasan Tentang Class Posttes2
![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/ab963f0a-ed5f-40f6-a7c3-422f8a52d54c)

Metode ini digunakan untuk mengatur nilai harga (price) suatu objek Bag. Metode ini bersifat final, artinya tidak dapat di-override oleh kelas turunan


![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/5048805d-e151-4143-863b-97ecb586d580)

Kode ini mendefinisikan paket tempat kelas Posttes2 berada. Selain itu, kode ini mengimpor kelas-kelas yang akan digunakan, seperti Bag dari paket Project.Bag, ArrayList, Iterator, dan Scanner dari pustaka Java

![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/8b561871-768a-44fb-bca1-2866c7fb23ad)

Ini adalah deklarasi kelas Posttes2, yang digunakan sebagai kelas utama (main class) untuk program ini. 
Kata kunci public dan final mengindikasikan bahwa kelas ini dapat diakses dari luar dan tidak dapat diwariskan

![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/658556b8-1f50-43c0-9362-1a994bfdf661)

Ini adalah metode main, yang merupakan titik masuk utama program. Semua kode di dalam metode main akan dijalankan saat program dimulai
kita mendeklarasikan dua variabel. ListBag adalah ArrayList yang digunakan untuk menyimpan objek-objek Bag, dan scanner adalah objek Scanner yang digunakan untuk menerima input dari pengguna.

![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/c5dd554a-14db-4ba2-8921-c6f999f96977)

gambar di atas adalah sebuah tampilan menu untuk memmilih apa saja yang kita tuju seperti menambahkan barang , melihat barang apa saja yang ingin di jual ,pilih barang ingin di lihat,dan juga mengupdate barang 
apabila ada barang yang ingin di tambahkan dan apabila barang sudah di tambahkan ada kesalahan bisa milih no 5 untuk menghapus barang. dan while true melakukan perulangan di bagian menu code ini bakal berhenti 
apabila kita exit.

![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/1005bb7a-5959-4bc0-9b82-2ced22a9b694)

pada gambar di atas adalah code dari menu nambah barang case satu menandakan bahwa untuk menambah
dengan memilih angka 1 dan terdapat perintah nambah nama,merek,dan harga barang yang ingin di tambahkan
scanner.nextLine Ini adalah bagian dari Scanner yang digunakan untuk membaca baris teks dari input yang diberikan oleh pengguna melalui keyboard atau sumber input lainnya. Dalam hal ini, nextLine() digunakan untuk membaca satu baris teks yang dimasukkan oleh pengguna.
Double.parseDouble Ini adalah metode yang digunakan untuk mengonversi (parse) string menjadi tipe data double. Metode parseDouble mengambil string sebagai argumen dan mengembalikan nilai double yang sesuai dengan nilai dalam string tersebut.
double price Hasil dari parsing (konversi) disimpan dalam variabel price. Ini berarti bahwa nilai numerik yang dimasukkan oleh pengguna dalam bentuk string akan diubah menjadi tipe data double dan tersimpan dalam variabel price

![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/d8b95722-def2-4cd3-a875-89cbc9f63786)

gambar di atas sebuah code yang di gunakan untuk melihat barang yang terdapat di dalam sebuah data bag dan
if (ListBag.isEmpty()) { - Ini adalah kondisi yang digunakan untuk memeriksa apakah ListBag (ArrayList yang menyimpan objek-objek Bag) kosong atau tidak. 
Jika ListBag kosong (tidak ada objek Bag di dalamnya),maka kondisi ini akan mengembalikan true System.out.println(p); - Dalam setiap iterasi, program akan mencetak informasi tentang objek Bag yang sedang diloop, 
dengan menggunakan metode toString() yang telah didefinisikan dalam kelas Bag.

![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/149f0d51-7537-4d9f-b9be-295c75973ff7)

pada gambar di atas menjelaskan code untuk melihat barang yang ingin di tuju apabila terdapat banyak barang maka kita dapat meilih lebih spesifik ke barang yang ingin
di tuju String namesearch = scanner.nextLine(); - Ini digunakan untuk membaca input yang dimasukkan oleh pengguna, yaitu nama tas yang dicari. Input ini disimpan dalam variabel namesearch

![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/41951592-7fd1-47d3-bff0-87e8a6facf7a)

pada gambar di atas berguna untuk mengupdate barang yang terdapat di dalam sebuah menu bag 
String namaUpdate = scanner.nextLine(); - Ini digunakan untuk membaca input yang dimasukkan oleh pengguna, yaitu nama tas yang akan diupdate. Input ini disimpan dalam variabel namaUpdate 
if (s.getName().equalsIgnoreCase(namaUpdate)) { - Dalam setiap iterasi, program memeriksa apakah nama objek Bag yang sedang diloop (s.getName()) sama dengan nama yang dimasukkan oleh pengguna (namaUpdate). Metode equalsIgnoreCase() digunakan untuk membandingkan nama secara case-insensitive (tidak memperhatikan huruf besar atau kecil).

![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/52dcaa86-c60d-4f14-bbc9-2c5030a5890e)

pada gambar di atas menjelaskan perintah untuk menghapus barang yang terdapat di dalam menu dan
System.out.print("Enter the name of the cellphone you want to delete:"); - Program mencetak pesan ke layar yang meminta pengguna untuk memasukkan nama tas yang ingin dihapus.
String namebagDelete = scanner.nextLine(); - Ini digunakan untuk membaca input yang dimasukkan oleh pengguna, yaitu nama tas yang akan dihapus. Input ini disimpan dalam variabel namebagDelete.

![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/da01e587-9c0d-44b3-8124-72d7fce0911e)

pada gambar di atas sebuah perintah untuk mengakhiri sebuah program dan 
System.exit(0); - Program menggunakan System.exit(0) untuk mengakhiri program secara tegas. Nilai 0 yang diberikan sebagai argumen menunjukkan bahwa program berakhir tanpa kesalahan. Ini akan menghentikan program sepenuhnya.

## Output dan Penjelasan
![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/9927d957-7308-4f11-b417-76548deef168)

dan pada gambar di atas ketika kita meilih 1 maka akan timbul perintah memasukan barang,brand,dan harga yang ingin di tambah

![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/262979cf-78e8-4352-a7e5-a47e213611ff)

dan pada gambar di atas ketika kita meilih 2 maka akan melihat barang yang terdapat di dalam sebuah data bag

![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/a2539162-ce8e-4d7f-8136-56a3e1675ef7)

pada gambar di atas ketika kita meilih 3 apabila kita ingin melihat barang lebih spesifik lagi

![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/2ad82a6b-d9e2-4813-9714-a8eda2e6bb39)

pada gambar di atas ketika kita meilih 4 apabila kita ingin mengupdate barang dan bakal terdapat perintah memasukan nama baru,brend baru,harga baru

![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/30fcd607-fb09-4b91-9f5a-1af1cd547c85)

pada gambar di atas ketika kita meilih 5 apabila kita ingin menghapus barang yang terdapat di dalam menu bag

![image](https://github.com/SyahfiRizqi05/postest2pbo/assets/127517301/1f68e110-5e1f-44a7-8a39-d6369394c2a5)

pada gambar di atas ketika kita meilih 6 apabila kita ingin keluar dari program apabila kita sudah tidak melakukan pemilihan di menu bag
