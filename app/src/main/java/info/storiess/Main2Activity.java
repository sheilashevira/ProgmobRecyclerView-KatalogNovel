package info.storiess;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private ArrayList<String> coverNovel = new ArrayList<>();
    private ArrayList<String> judulNovel = new ArrayList<>();
    private ArrayList<String> genreNovel = new ArrayList<>();
    private ArrayList<String> infoNovel = new ArrayList<>();
    private ArrayList<String> karyaNovel = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getDataFromInternet();

    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(coverNovel, judulNovel, genreNovel, infoNovel, karyaNovel, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        judulNovel.add("Behind the Bullying");
        genreNovel.add("Fiksi");
        coverNovel.add("https://a.wattpad.com/cover/98056865-176-k869038.jpg");
        karyaNovel.add("Natasweet_");
        infoNovel.add("Di suatu komplek perumahan tinggallah seorang gadis bernama Alana Pradirga, ia memiliki tubuh mungil dengan rambut panjang yang selalu ia gerai dan kacamata hitam bulat yang menghiasi wajah ovalnya. Alana memiliki sifat pendiam dan tak banyak tingkah, setiap hari ia selalu menyisihkan sebagian waktunya untuk membaca buku meski itu hanya untuk membaca catatan kecil yang selalu ia tulis seusai pulang sekolah. \n" +
                "Tidak banyak yang tahu jika Alana adalah anak yang pintar. Orang tuanya sudah meninggal sejak beberapa tahun silam akibat kecelakaan maut yang membuatnya harus hidup sebatang kara. Kini ia tinggal di sebuah rumah peninggalan kedua orang tuanya.Pagi ini, Alana memilih untuk menaiki sepeda pemberian pamannya yang baru ia terima beberapa bulan lalu. Sesampainya di sekolah tidak ada yang istimewa, ia hanya mendapatkan tatapan benci dari para kalangan penguasa sekolah seperti Megan yang kini sedang berdiri di depannya. Alana memejamkan matanya lalu menarik napas panjang, ia hanya bisa menundukkan kepalanya di depan Megan yang notabenenya adalah anak dari pemilik yayasan yang sangat hobi mencaci anak antisosial sepertinya. “Dasar cupu! Lo cuma jadi sampah di sekolah ini, ngapain masih sekolah?” cerca Megan dengan pedasnya hingga membuat Alana kembali menitihkan air mata. Ini belum seberapa jika dibandingkan dengan yang sudah Alana alami sebelumnya, bahkan yang paling buruk ia pernah dipermalukan di depan umum dengan disiram menggunakan air sisa mencuci piring di tengah lapangan setelah praktek olahraga. Alana menghela napas, mencoba lebih tegar. Ia pun segera pergi menuju ke kelas.Jam pertama adalah matematika, pelajaran yang paling Alana suka sejak duduk dibangku sekolah dasar. Tapi kesempatan ini digunakan taman sekelas Alana untuk memanfaatkan Alana supaya mau mengerjakan tugas rumah yang diberikan oleh guru.\n" +
                "“Hei cewek culun! Lo ‘kan pinter mantematika nih, kerjain punya gue dong biar dapet bagus kayak lo,” ujar Adrian seraya memberikan sebuah buku tulis bersampul hijau itu pada Alana. “Maaf, tapi aku gak bisa, masih ada tugas lain.”\n" +
                "“Alah lo sibuk ngapain sih? Cuma dua puluh soal doang, gue gak minta lo buat ngerjain satu buku kali, pelit amat!” cibir Adrian dengan wajah kesalnya. \n" +
                "“Lo mau gue laporin ke Megan biar di keluarin dari sekolah? Cewek cupu aja belagak sok pinter, jangan belagu deh, lo gak ada apa-apanya sama Megan, ngerti?” tambahnya.Alana tahu ia hanya seorang yatim piatu yang tidak memiliki apapun. Tapi apa salahnya jika Alana menolak, toh ia memiliki hak atas keputusannya. Mungkin kali ini tidak. Ini sudah menjadi kebiasaannya, ancaman di keluarkan dari sekolah adalah senjata paling ampuh untuk membuat Alana menyerah. \n" +
                "“Ya udah, nanti aku kerjain.”\n" +
                " “Gitu dong, jangan sampe lupa ya.” \n" +
                "Itulah kalimat yang Adrian ucapkan sebelum pergi. Alana mungkin lelah tapi kehidupan tak pernah mengizinkannya untuk menyerah\n" +
                "Hari-hari Alana menjadi sedikit lebih tenang dari biasanya. Megan kini tak lagi menampakkan wajahnya setelah insiden beberapa hari lalu, ketika ada seorang siswa yang tidak diketahui namanya melaporkannya ke kepala yayasan atas perbuatan Megan yang suka membully. \n" +
                "Sebenarnya Alana turut bersedih, ia yakin Megan melakukan itu pasti ada alasannya, karena tidak mungkin suatu tindakan dilakukan tanpa dilandasi dengan sebuah alasan. Untuk itu Megan dihukum skors selama satu minggu. Namun, berselang sebulan setelah itu, sang ratu bully itu kembali melancarkan aksinya. Hari ini Alana ada jadwal membersihkan lapangan indoor, jadi ia pulang lebih lambat dari sebelumnya. Kemudian suara tepuk tangan menggema di seluruh sudut ruang. Alana menengok ke arah sumber suara, disana sudah ada Megan dengan senyumnya yang begitu menyebalkan. Alana masih diam di tempat, sementara Megan mulai berjalan menghampiri Alana dengan tatapan buas seperti ingin menerkam mangsa yang sudah lama diincar. \n" +
                "“Lo gak usah main di belakang gitu dong!” serunya seraya mendorong bahu kanan Alana. Hingga ia berjalan mundur. Gadis itu diam, masih tak mengerti apa yang dimaksud oleh Megan.\n" +
                "“Gue tahu, lo yang ngelaporin gue ke ketua yayasan ‘kan? Munafik banget sih!” lanjutnya sambil mendorong pundak kiri Alana. Gadis itu semakin terpojok karena didorong oleh Megan. Sampai bahunya sudah menyentuh tembok. Alana menggeleng. Ia bahkan tidak tahu menahu tentang bagimana Megan bisa dilaporkan dan diberi hukuman. \n" +
                "“Cara lo murahan, kalo lo ada dendam sama gue, apa salahnya sih buat maafin, toh gua gak pernah tuh ngirim lo pergi ke rumah sakit ‘kan?” cerca Megan yang mulai tersulut kemarahannya. Alana tahu, Megan salah paham akan semua ini. Ia tak pernah sekalipun menentang permintaan Megan apalagi melaporkan perbuatan Megan pada ketua yayasan, toh tidak ada barang sekecilpun nyali yang Alana miliki untuk melakukan itu semua. \n" +
                "“Lo berhasil ngebuat harga diri gua jatuh, Na. Lo bahkan berhasil buat gue diusir dari rumah, apa lo mau gue mati sekalian supaya hidup lo tenang? Jawab Na!” bentaknya seraya mendorong Alana sampai jatuh tersungkur, sampai kepala Alana membentur tembok cukup keras. Seakan dihantam baja, Alana merasa kini bayangan Megan ada dimana-mana. Rasanya begitu sakit hingga menjalar ke saraf pusat kepalanya, tak sadar sampai ia mulai menangis. \n" +
                "“Sakit,” ringisnya seraya memegangi kepalanya yang mulai terasa pening. \n" +
                "“Lebih sakit mana sama gue? Lo harus tanggung jawab Alana.”  Megan meraih tangan Alana lalu menyeretnya pergi dari ruang lapangan indoor.Alana berjalan dengan gontai mengikuti ke mana Megan akan membawanya pergi. Dengan samar-samar Alana mengingat sesuatu, jika koridor ini mengarah pada kamar mandi di samping gudang peralatan. \n" +
                "“Ini kamar mandi?” tanya Alana ketika mereka berhenti tepat di depan sebuah pintu berwarna biru. \n" +
                "“Udah tahu pake nanya segala, kalo lo aja bisa ngebuat gue sakit kenapa gue nggak bisa coba? Selamat menikmati harimu di dalam kamar mandi Alana Pradirga,” ucapnya seraya mendorong Alana masuk ke dalam kamar mandi. Megan segera menutupnya lalu menguncinya dari luar. Terdengar suara teriakan Alana dari luar, tapi itu semua tidak membuat hati Megan meluluh, ia bahkan sudah cukup puas akan apa yang baru saja ia lakukan.Sementara itu di dalam kamar mandi, Alana kembali berurai air mata. Suaranya sudah habis ia gunakan untuk berteriak, hanya tersisa rintihan lemah yang ia ucapkan, tapi percuma tak ada seorangpun yang bisa mendengarnya.\n" +
                "Suhu udara di dalam kamar mandi pun mulai mendingin dan kondisi tubuh Alana yang kurang baik membuatnya semakin tersiksa berada di dalam sana. Lampu yang semula menyala kini sudah mati, terdengar suara bunyi gerbang sekolah yang ditutup membuat tangisan Alana semakin tak tertahankan. Ia berjongkok sambil memeluk kedua lututnya merasakan jika tubuhnya kini mulai menggigil.\n" +
                "Air matanya sudah mengering. Ia tak sanggup lagi untuk menangis, karena tenaganya sudah habis. Untuk bernapas saja ia seakan sudah tak mampu. Seragam sekolahnya kini hanya seperti selembar kain tipis yang menyelimutinya. Pandangannya memburam, ia tidak bisa melihat dengan jelas, perlahan-lahan kesadaran Alana hilang. Dua hari berlalu, sejak kematian Alana yang ditemukan dalam keadaan tak bernyawa sehari setelah dia dikunci di dalam kamar mandi. Tidak ada yang tahu siapa yang mengunci Alana di tempat seburuk itu. Hanya beredar isu jika Alana ditawan oleh seorang murid psikopat. Megan yang mendengar kabar itu sempat takut, ia takut jika ada saksi ketika ia melakukan itu. Tapi untung saja tidak ada, karena semua siswa sudah dipastikan pulang saat itu dan CCTV juga sengaja tidak dipasang di sana. Namun, rasa takut masih menghantui Megan saat mengingat kejadian itu. \n" +
                "“Kasihan Alana, yang ngelakuin itu pasti kesehatan rohaninya udah gak waras deh,” ujar salah satu siswa yang sempat didengar Megan saat melewati koridor kelas duabelas. \n" +
                "“Sialan!” umpat Megan.Pagi ini sekolah mengadakan Sabtu bersih. Kelas Megan mendapat bagian membersihkan kelas XI IPA-2 yang dulunya adalah kelas Alana. Saat membersihkan meja di ujung ruangan, tak sengaja ia melihat sebuah buku catatan kecil berwarna jingga di kolong meja. Buku itu bertuliskan nama Alana dan terdapat sebuah gambar karikatur di tengahnya. Untuk mengusir rasa penasaran Megan, ia membuka buku itu perlahan. Di halaman pertama ia melihat biodata lengkap Alana. Namun, ada sebuah catatan kecil di halaman berikutnya yang membuat Megan seketika teringat akan kejadian menyedihkan yang Alana lewati sendirian.\n" +
                "\n" +
                "Dear Megan\n" +
                "Hari ini kamu membuat aku merasa menjadi manusia paling buruk setelah kamu menyiram aku  dengan air sisa cucian piring. Aku berpikir sejenak tentang itu, mungkin aku berhak mendapatkannya karena aku memang pantas untuk kamu bully. Bagiku kamu adalah satu-satunya teman untukku, bahkan jika kamu menginginkan aku untuk selalu menjadi sasaran bullymu berikutnya, aku sudah siap. Perlakuan burukmu padaku, itu semua aku anggap sebagai hadiah kecil darimu untukku. \n" +
                "\n" +
                "Terima kasih Megan, sudah menjadi temanku bahkan aku tidak tahu apakah kamu ingin berteman dengan anak cupu dan culun sepertiku atau tidak, tapi sepertinya itu  hanya sebuah mimpi. Aku hanya berharap jika suatu hari nanti kita bisa menjalin pertemanan tanpa ada rasa iri dan dengki, tentu saja saat kamu berhenti membullyku dan memulai untuk menjalin ikatan perteman, aku akan menunggu sampai saat itu tiba. \n" +
                "\n" +
                "Tertanda  seseorang  yang  ingin  menjadi  temanmu\n" +
                "Alana  Pradirga\n" +
                "\n" +
                "Megan menghapus air mata yang mulai membasahi pipinya. Ia begitu bodoh untuk menyadari jika manusia yang lain juga memiliki perasaan. Hatinya sudah terbungkus rapat oleh kesombongan dan kebencian yang ia tanamkan sejak kecil. Alana begitu baik padanya. Dirinya tidak pernah menyadari jika selama ini Alana menahan penderitaannya sendiri. Rasa kemanusiaan sudah tidak ada pada diri Megan. \n" +
                "“Kenapa lo harus baik sama gue, Na? Padahal gua udah jahatin lo, ngebully lo, kenapa harus lo yang jadi korbannya?” tanya Megan, entah siapa yang bisa menjawab pertanyaan itu. Tapi satu hal yang kini Megan tahu, semua yang terbungkus dengan baik belum tentu isinya sebaik sampulnya, terkadang yang sederhanalah yang paling berkenang meski itu hanya berisi barang yang mungkin tidak kita pikirkan sebelumnya. Megan sudah memikirkan semuanya dengan matang, ia akan menyerahkan diri ke polisi. Kebenaran tidak akan pernah terkuak selama pelaku masih bersembunyi dibalik kesalahannya.\n" +
                "Kesalahan yang sudah dilakukan Megan telah membawanya ke dalam sebuah penyesalan yang akan ia ingat selama sisa hidupnya. Jika saja ia tidak melakukan pembullyan terhadap temannya mungkin sekarang ia bisa menikmati masa mudanya dengan teman sebayanya.\n" +
                "Tapi nasi sudah menjadi bubur, yang mati tidak dapat dihidupkan kembali meskipun kita mau. Penyesalan selalu datang di akhir, maka sebuah keputusan pun harus diambil dengan kepala dingin dengan memikirkan akibatnya, agar hasil dari keputusan yang diambil tidak akan mengecewakan kita nantinya. Karena sejatinya usaha tidak akan pernah mengingkari hasil.\n");

        judulNovel.add("The Nurse and A Sick Boy");
        genreNovel.add("Romance");
        coverNovel.add("https://a.wattpad.com/cover/143627087-176-k379079.jpg");
        karyaNovel.add("Basicfullmoon");
        infoNovel.add("Langkahku terus menelusuri koridor rumah sakit\n" +
                "Sejak setahun yang lalu, paru-paruku sudah mulai akrab dengan aroma obat-obatan di sini.\n" +
                "Rumah Sakit Bahagia, katanya. Namun setelah mengobservasi selama setahun penuh, tidak sekalipun kutemui pasien yang mampu bahagia dengan penyakit mereka.\n" +
                "Setiap hari, dengan tampang menyemangati, yang bisa kulakukan hanya keluar-masuk dari kamar ke kamar untuk memberi suntikan obat dan makanan kepada para pasien, menunggu shift-ku berakhir dan digantikan oleh perawat lain.\n" +
                "Minggu ini aku mendapat shift malam yang artinya aku harus bekerja mulai pukul delapan malam sampai pukul delapan pagi.\n" +
                "Dengan mata yang sudah kuistirahatkan selama siang tadi, aku mendorong sebuah meja yang ditopang oleh empat buah roda kecil. Di tengah koridor lantai lima, kudapati seorang anak dengan kepala gundul menatapku resah.\n" +
                "Semakin kudekati, semakin jelas tatapan khawatir anak itu terhadapku. \n" +
                "“Kamu kenapa di sini, dek?” tanyaku berusaha ramah.\n" +
                "Anak yang berusia sekitar tujuh tahun itu tersenyum tulus, “Aku sakit kanker hati sta-... dium tiga, Kak Perawat.” Aku tertegun sebentar, lalu menatap khawatir pada anak itu. Sakit rasanya melihat kelangkaan kanker hati pada anak-anak dialami oleh anak ini. “A ... ri ... na! Nama kakak, Arina, kan?” \n" +
                "Senyum anak itu masih belum juga luntur. Aku mengelus kepalanya yang sudah tidak ditumbuhi rambut itu. “Wah ... Kamu pintar baca, ya. Nama kamu siapa?\" \n" +
                "“Adam.” Ia mengulurkan tangan kecilnya.\n" +
                "Tentu kubalas dengan uluran tangan dan senyum penyemangat untuknya. \n" +
                "“Kalau gitu, Adam masuk kamar aja, ya? Harus banyak-banyak istirahat, biar Adam cepat sembuh.” \n" +
                "“Kamar Adam di situ, Kak Arina,” tunjuk Adam pada kamar yang berada paling dekat dengan kami. “Adam nggak bisa tidur, jadi Adam mau keluar dulu cari teman soalnya Adam udah tiga bulan nggak main sama teman-teman Adam.” \n" +
                "“Kalau gitu, Kak Arina aja yang jadi teman Adam. Tapi, sekarang &apos;kan sudah jam sepuluh. Anak pintar kayak Adam harus istirahat, biar besok pagi kita bisa main bareng-bareng.” Aku berusaha menasihatinya. \n" +
                "Setelah disetujui Adam, aku mengantar Adam masuk ke kamarnya, lalu menuntunnya menaiki tangga kecil yang disediakan di samping tempat tidurnya. \n" +
                "“Adam mau ditemenin sampai tidur?” \n" +
                "“Nggak perlu, Kak Arina. Adam berani, kok. Kata Mama &apos;kan, kalau mau jadi tentara harus berani, gak boleh takut.” \n" +
                "Sekarang aku mengerti, kenapa tadi Adam berani meninggalkan kamarnya saat kamar lain sudah tidak menampakkan cahaya lampu. \n" +
                "Sepertinya Adam anak yang terlalu pemberani. Sebaiknya aku tidak meninggalkannya di kamar sendirian, bisa saja ia kembali bosan dan mengelilingi satu rumah sakit sampai lupa jalan kembali. \n" +
                "“Kak Arina di sini aja, deh sampai Adam tidur.” \n" +
                "“Tapi aku belum ngantuk lho, Kak. Nanti Kak Arina bisa nunggu lamaaa banget. Kayak kemarin aja nih, Kak, aku baru bisa tidur jam dua belas. Untung aja kemarin ada Mama.” \n" +
                "Sepertinya, Adam anak yang sangat suka menceritakan pengalamannya pada orang lain. Sayang sekali, anak yang ceria dan supel itu tidak bisa menjalani hidup senormal anak lainnya. \n" +
                "“Memangnya sekarang Mama ke mana?” \n" +
                "“Mama aku kerja di-em ... Adventer, Kak,” jawabnya berusaha mengingat nama perusahaan yang lumayan terkenal itu. “Kata Mama, kalau pulangnya lama, berarti Mama lagi lembur, Kak.”\n" +
                "Aku mengangguk mengerti, lalu bertanya lagi untuk mengumpan rasa kantuk Adam. “Kalau Papa mana?” \n" +
                "“Kata Mama, Papa nggak tinggal sama aku sama Mama lagi, Kak.” \n" +
                "Sungguh, aku sangat prihatin dengan Adam dan Mamanya. \n" +
                "Tiba-tiba saja aku teringat saat Adam menatapku dengan tatapan khawatir tadi saat kami berada di koridor. Baru saja akan kutanyakan, Adam sudah bertanya lebih dahulu. “Kak Arina kenapa jadi perawat?” \n" +
                "“Karena Kakak ... mau?” Jawaban yang kuberikan justru terdengar seperti pertanyaan. \n" +
                "“Cita-cita Kakak apa?” tanya Adam penasaran. “Kita nggak bisa melakukan pekerjaan yang kita nggak bahagia kalau lakuin itu &apos;kan, Kak?” \n" +
                "Aku tertegun. Meskipun bahasanya sulit dipahami, aku bisa sedikit banyak mengerti dari apa yang barusan Adam katakan. Aku tidak bisa bekerja sebagai perawat kalau aku tidak menikmatinya, itu maksud Adam. \n" +
                "“Cita-cita Kakak sebenarnya memang bukan jadi perawat.” Aku menimbang-nimbang, apa tidak apa-apa jika memberitahu rahasiaku pada seorang anak SD? Setelah berpikir sedikit lama, aku melanjutkan, “Kakak mau jadi ... Rapper.” \n" +
                "“Kalau gitu, kak Arina harus bisa jadi Rapper, biar Kak Arina bisa kerja dengan bahagia. Iya &apos;kan, Kak?” \n" +
                "Adam benar. Untuk apa aku bermimpi kalau bukan untuk dicapai? \n" +
                "“Mama pernah bilang, mimpi tinggi-tinggi nggak apa-apa, asalkan kita berani berusaha untuk bisa buat mimpi itu nyata.” \n" +
                "“Mama kamu benar, Dam.” \n" +
                "Rasanya aku kagum dengan mama Adam, sampai kuputuskan untuk memberitahu Adam agar nanti mengenalkanku pada mamanya. “Adam janji, besok, sebelum Adam operasi, Adam bakal kenalin kak Arina ke Mama.” \n" +
                "“Makasih ya, Dam.”\n" +
                "Esoknya, aku berangkat ke rumah sakit lima jam lebih cepat dari waktu shift-ku untuk menemani operasi Adam. Sejujurnya, aku sudah menganggap Adam sebagai adik kandungku. \n" +
                "Adam benar-benar memperkenalkanku dengan Mamanya, seorang wanita berparas cantik dan memiliki rahang yang menonjol, menunjukkan kerasnya perjuangan hidupnya selama ini. \n" +
                "Sebelum Adam dioperasi, ia terus mengingatkanku dengan ucapan Mamanya yang ia beritahukan padaku malam itu. “Jangan dilupa ya, Kak. Adam mau semua orang baik kayak Mama sama Kak Arin hidup bahagia.” \n" +
                "Aku yang sudah lama mengidam-idamkan sosok adik menunggu Adam keluar dari ruang operasinya. Mama Adam terlihat sangat risau. Aku berusaha menenangkannya dengan berkata bahwa hanya sepuluh persen kemungkinan operasi kanker hati gagal saat pasien masih berada di stadium lanjut. Namun Mama Adam tetap tidak bisa tenang. \n" +
                "Satu jam kemudian, seorang dokter keluar dan memberi kabar yang sudah ditunggu oleh kami. “Maafkan kami, Bu. Kami tidak bisa menyelamatkan Adam. Hatinya sudah terlanjur terpengaruh sel kanker dengan sangat parah, sampai menjalar ke kelenjar getah bening,” \n" +
                "“Ta-tapi, Dokter Rendi, bukannya kankernya Adam masih stadium tiga? Kok penyebarannya sudah separah stadium empat?” \n" +
                "“Adam bilang masih stadium tiga, ya? Tapi lima hari yang lalu saya sudah beritahu Ibunya Adam kalau Hepatocellular carcinoma-nya Adam sudah memasuki stadium empat.” \n" +
                "Tanpa sadar, air mataku mengalir dari kedua kelopak mataku. Kami baru berkenalan malam kemarin, tapi rasa sakit yang kurasakan sama seperti saat aku kehilangan kedua orangtuaku di ulangtahunku yang ke empat belas. \n" +
                "Kami berdua masuk, ingin menemui Adam. Terlihat beberapa perawat yang kukenal sedang membersihkan badan Adam, lalu menutupnya menggunakan kain kafan. \n" +
                "Tidak peduli jika aku harus bekerja dengan rasa kantuk yang sangat berat malam nanti. Aku tidak butuh tidur. Aku hanya butuh Adam, adik pemberaniku. \n" +
                "“Arina, Masuk!” \n" +
                "Aku menyimpan foto itu kembali ke dalam buku harianku. Foto seorang anak laki-laki berpakaian seragam SD dengan senyum semangat yang sudah tidak sabar untuk belajar agar bisa menjadi seorang tentara, sesuai mimpinya. \n" +
                "Setelah menyimpan barangku ke dalam tas, kuambil senjata tempurku di sebelahnya. \n" +
                "Kubuka tirai besar di hadapanku. Teriakan mulai menggema di langit-langit studio. Di tangan kananku sudah terpasang sebuah benda tempur yang berupa microphone berwarna emas yang kubeli dengan kerja kerasku sendiri. \n" +
                "Aku mengujarkan kalimat kesukaanku yang kusimpulkan dari perkataan Adam, “Baiklah, saatnya bertempur menggapai mimpi.” \n" +
                "Sebuah suara samar memaksa masuk ke gendang telingaku, mengalahkan riuhnya teriakan para pembeli tiket, “Kak Arina hebat, Adam bangga.”\n");

        judulNovel.add("Tiada");
        genreNovel.add("Horor");
        coverNovel.add("https://a.wattpad.com/cover/210068757-176-k660040.jpg");
        karyaNovel.add("Adityasapp");
        infoNovel.add("Perkenalkan nama saya ryan, saya seorang pemuda yang tumbuh besar di daerah jawa barat tepatnya di dusun ciwangi\n" +
                "Saya berasal dari keluarga sederhana\n" +
                "saya mempunyai ayah yang berprofesi sebagai saudagar ubi cilembu,dan seorang ibu yang bekerja dirumah menjaga warung\n" +
                "Pada kesempatan kali ini saya akan berbagi kisah saya, kisah tentang perasaan saya ke seorang wanita yang saya cintai. \n" +
                "Dan ini adalah kisah saya\n" +
                "Setelah lulus SMA maka saya memutuskan untuk tidak lanjut ke jenjang kuliah, karena saya terlalu malas untuk melanjutkan pendidikan\n" +
                "Berbanding terbalik dengan Putri, dia wanita yang satu sekolah dengan saya, setelah lulus dia berkeinginan melanjutkan kuliah di salah satu kampus swasta di Bandung\n" +
                "Hari demi hari saya lalui dengan membantu ibu jaga warung, sambil merenung dan berharap menerima telepon dari perusahaan yang sudah saya lamar. \n" +
                "“heh, masih pagi kok udh bengong aja sih yan” ucap putri sambil tertawa kecil. \n" +
                "“siapa yang bengong sih put” ucap aku sambil menahan malu dan mengalihkan pandangan ke sepatu joging putri.\n" +
                "Setelah itu kami berdua memulai obrolan ringan, sampai pada akhirnya putri menanyakan hal serius kepadaku.\n" +
                "“kamu masih inget Didi?” tanya putri dengan nada rendah. \n" +
                "“iya aku ingetlah, dia kan yang dulu keroyokin aku terus buang sepatu sekolah aku di sungai, karena dia cemburu liat aku negor kamu waktu di depan gerbang sekolah pas jam pulang” jawab aku sambil mengingat kejadian tidak mengenakan itu. \n" +
                "“maaf untuk hal itu yan” jawab putri dengan suara lirih. \n" +
                "“itu bukan salah kamu put,jadi kamu gausah minta maaf, ngomong-ngomong ada apa sih put?” tanyaku \n" +
                "“aku minta nomormu lagi yan, nanti aku ceritain di telpon aja ya, karena aku mau bantuin ibu beresin rumah” jawab putri sambil menatap lirih ke arahku. \n" +
                "Setelah itu aku memberi nomor telepon ku lagi ke putri, dengan perasaan bingung karena dulu aku sudah pernah memberi nomor telepon ku ke putri, “ah paling nomorku di hapus sama si didi itu” gumamku dalam hati. \n" +
                "Putri pun pulang kerumahnya, dan aku melanjutkan menjaga warung sampai siang hari. \n" +
                "Setelah sholat ashar aku langsung membantu ayah dilapaknya untuk menimbang ubi cilembu yang baru datang dari petani. \n" +
                "Menjelang malam aku langsung mengambil jaket tebal punyaku, maklum saja karena tempat tinggalku berada persis dibawah gunung jadi harus mengenakan jaket tebal saat menjelang malam jika tidak ingin masuk angin. \n" +
                "Setelah itu aku duduk sambil mencoba menelpon putri duluan sambil menunggu mobil yang datang dari bandung untuk mengambil ubi cilembu yang sudah ditimbang tadi sore.\n" +
                "“Put” tanya ku dengan singkat dan padat. \n" +
                "“iya yan? maaf ya angkatnya lama barusan aku abis dari dapur” balas putri \n" +
                "“kamu mau ngomong apa sebenernya sih put? bikin orang penasaran aja” tanyaku sambil menyenderkan badan dikursi. \n" +
                "“tapi kamu janji ya gabakal marah ke aku yan”tanya putri \n" +
                "“iya aku janji put” jawabku dengan perasaan gugup. \n" +
                "“sebenernya aku tau kok yan tentang perasaan kamu ke aku selama ini, awalnya aku gapercaya, karena kamu temen aku dari kita masih kecil, setelah banyak temenku yang cerita kalo kamu naksir sama aku, dan aku sendiri suka merasakan terkadang perbuatan kamu itu aneh” jawab putri tanpa basa basi \n" +
                "“aneh gimana put” tanyaku sambil menahan rasa sedih karena pernyataan putri yang terkesan tidak peduli perasaanku \n" +
                "“kamu itu baik ke aku yan, baik banget, dan itu tuh rasanya aneh kalo cowok ada yang baik sebegitunya kaya kamu, aku masih inget kok pas kamu bawain aku obat asma aku kebandung saat aku lagi Ldks, dan aku masih inget kamu peringatin aku tentang didi yang menurut feeling kamu dia itu cowo ga bener, dan aku masih inget sehabis kamu dikeroyokin itu kamu masih bisa melempar senyum ke aku dan masih mau natap wajahku yan” jawab putri dengan suara lirih. \n" +
                "“kamu bener yan, coba aja dulu aku dengerin omongan kamu, gabakal kaya gini jadinya” ucap putri dengan suara ingin menangis. \n" +
                "“kenapa put? emangnya didi ngapain kamu” tanya ku dengan suasana hati tidak karuan. \n" +
                "“aku putus dari didi yann, dia makin kasar ke aku, padahal aku udh coba bertahan sekuat aku, itu aku lakuin karena aku udh ga suci lagi yan, akhirnya aku ambil keputusan buat putusin didi, sekaligus bersiap untuk 1 bulan lagi pindah ke kostan di Bandung yang akan aku tempatin selama aku kuliah disana” ucap putri sambil mengeluarkan tangisan yang sedari tadi dia sudah tahan\n" +
                "Saya sudah paham maksud putri, dan tidak ingin membuat dia sedih dengan pertanyaan aku, maka saya memutuskan untuk menyuruh dia tidur dan beristirahat, namun sebelum tidur putri meminta sesuatu yang membuat saya kaget sekaligus senang, sekaligus sedih.\n" +
                " “sebelum aku pergi, Lusa aku pengen pergi sama kamu yan, kita pergi bareng kebandung sekaligus aku mau tunjukin kostan aku disana,biar kalau ada waktu kamu bisa jenguk aku di Bandung” ucap putri\n" +
                "Aku iyakan permintaan putri dengan perasaan campur aduk antara kaget,senang dan sedih karena harus jauh dari putri.\n" +
                "Kita sudahi pembicaraan dan setelah selesai urusan dengan mobil yang ingin mengambil ubi cilembu, aku pergi pulang sama ayah tepat pukul 10 malam.\n" +
                "Karena lelah maka aku putuskan untuk langsung tidur saja.\n" +
                "Pagi hari pun tiba dan aku langsung saja sarapan, ditengah menikmati sarapanku, ibu memberi tahu jika saudaraku dari Jakarta akan datang minggu depan, dia adalah Galih saudaraku, dan tante dewi, dan juga om yudi.\n" +
                "Langsung saja aku telepon Galih dan bercanda menanyakan ingin dijamu seperti apa nanti saat sudah tiba disini, kami berbicara banyak di telepon selama setengah jam. \n" +
                "Setelah itu aku pun kembali ke rutinitas yaitu jaga warung, sambil menahan rasa tidak sabar untuk cepat besok, maklum karena ini pertama kalinya aku jalan sama putri sampai keluar kota. \n" +
                "Langsung saja aku chat putri dan membicarakan tentang rencana untuk jalan-jalan besok, setelah selesai chatan kamipun kembali ke aktivitas masing-masing. \n" +
                "Dan Sore hari pun tiba disertai dengan hujan yang begitu derasnya, udara menjadi semakin dingin. \n" +
                "Malam pun datang, tepat pukul 8 hujan malah semakin deras, pikiran ku berantakan memikirkan tentang besok. \n" +
                "Aku cek hp sinyal hp pun hilang, dan itu semakin membuatku gak karuan, akhirnya aku putuskan saja untuk tidur dan berharap esok pagi mentari akan terbit dengan disertai pelangi dan menggantikan hujan yang deras malam ini. \n" +
                "Aku terbangun pagi sekali jam 5 pagi, dengan badan yang sakit-sakit, tidurku tidak nyenyak, sepertinya saya masuk angin akibat hujan deras semalam. \n" +
                "Langsung saja aku menuju ruang tengah untuk bersiap sarapan, namun lupa bahwa sarapan tentu saja belum ada karena orang tuaku masih belum pulang dari pasar. \n" +
                "Setelah puas santai di ruang tengah,tepat pukul 6 pagi aku langsung saja buka warung ibu sendirian, dan duduk santai sambil menunggu pembeli. \n" +
                "Sambil menahan rasa lapar dan bosan aku duduk sambil heran tidak biasanya banyak orang berlalu lalang lewat di depan warung tapi tidak ada satupun yang mampir. \n" +
                "Ditengah rasa bosan dan lapar, aku melihat wanita menghampiri \n" +
                "“yan” sapa putri dari kejauhan \n" +
                "“put gimana nanti, jadikan?” tanya ku dengan penuh harap \n" +
                "“maafin aku yan, aku gabisa” jawab putri dengan nada suara pelan \n" +
                "“Loh kenapa kok gajadi, kenapa sih gajadi put?” tanya ku dengan rasa kecewa \n" +
                "“Maaf yan” jawab putri dengan jawaban yang sama\n" +
                "Aku perhatikan muka putri yang rada pucat, lalu bertanya apakah karena kondisi badan makanya tidak jadi pergi. \n" +
                "“kamu sakit put? muka kamu pucat begitu” tanya ku dengan rasa heran \n" +
                "“Aku ga sakit yan, kamu belum sadar, dan kamu belum mengerti, ini semua karena kamu egois dan keras kepala” jawab putri sambil meninggalkanku sendirian diwarung. \n" +
                "Aku tertegun mendengar jawaban nya, dan dengan rasa sangat kebingungan atas jawaban putri, akhirnya aku merenung dan memikirkan ini semua, aneh sekali pagi sungguh aneh. \n" +
                "Jawaban putri yang seperti itu, dan tunggu dulu, mereka siapa yang lewat dari tadi di depan warung, banyak sekali wajah asing yang aku lihat. \n" +
                "Lalu seorang kakek tua datang menghampiriku \n" +
                "“Ikhlaskan nak, pejamkan matamu dan berdamailah dengan ini semua, tenanglah dan ikhlaskan” Ucap kakek tua itu dan setelah itu dia langsung pergi begitu saja\n" +
                "Aku makin heran dengan ini semua, aku semakin merenung dan akhirnya aku berpikir untuk ikhlas tidak jadi pergi dengan putri. \n" +
                "Aku pejamkan mata, aku tarik napas dan hembus perlahan, aku coba tenang dan ikhlas dengan ini semua. \n" +
                "Namun saat aku membuka mata, aku berteriak sejadi-jadinya. \n" +
                "Sementara itu dijakarta saudaraku galih sedang asyik menonton tv dan juga berteriak sama seperti ku barusan. \n" +
                "“Mamaaaaaaaah, cepetan kesini” teriak galih \n" +
                "“Kenapa sih, bikin kaget aja” jawab tante dewi sambil menghampiri galih \n" +
                "“Ini mah liat” jawab Galih dengan nada lirih \n" +
                "“Telah terjadi longsor dini hari di dusun ciwangi, tepat pukul jam 12 malam, tanah yang berada persis diatas dusun tersebut ambuk karena terkikis air hujan yang sangat deras sedari kemarin sore, Tim pencarian sudah mendata semua jenasah dusun ciwangi, dan memastikan bahwa semuanya meninggal dunia” Ujar presenter pembawa acara Tv\n" +
                "Itulah kisah saya, seorang pemuda yang jatuh cinta, hingga akhirnya mendapat kesempatan pergi bersama wanita yang sudah lama disayangi. \n" +
                "Hingga pada akhirnya, ego ku yang aku punya untuk memaksakan diri untuk tetap pergi dengan putri, menghalangiku untuk pergi ke peristirahatan abadi. \n" +
                "Ini aku, Dibutakan oleh cinta sampai aku tidak sadar bahwa aku telah tiada\n");

        judulNovel.add("Magiko");
        genreNovel.add("Fantasi");
        coverNovel.add("https://a.wattpad.com/cover/179846302-176-k314452.jpg");
        karyaNovel.add("Airazoey");
        infoNovel.add("Seperti biasanya aku menyukai sudut kamar ini. Sebuah kursi kayu tua dipernis sedemikian rupa hingga mengilap. Aku sedang duduk di atasnya. Seraya itu aku melirik sebuah jam dinding kuno yang besar di kamar apartemen ini-menunjukkan pukul 2 dini hari. Dan dari tempat aku berada ini, aku memerhatikan mantan kekasihku. Kami putus hubungan tiga tahun yang lalu. Dia sudah memiliki kekasih baru. Berbeda dengan janji yang pernah diucapkannya dulu akan setia padaku. Bullshit! \n" +
                "\tLelaki berusia dua puluh lima tahun itu menarik selimutnya hingga menutup seluruh bagian tubuh kecuali wajah. Lampu kamar dimatikan. Hanya lampu tidur redup dengan cahaya remang-remang yang menyala. Namun, wajah tampannya masih terlihat sangat jelas di mataku. Dia seperti tiga tahun yang lalu saat kami sama-sama masih duduk di bangku kuliah. Tidak ada yang berubah, bahkan kamar apartemen ini sekali pun. Hanya saja mungkin hatinya telah berubah. Ia sudah menyerahkan hatinya yang selalu kudambakan pada wanita lain. Entah aku harus sedih atau bahagia.\n" +
                "\tAku tidak bisa tidur semalaman. Sejak aku kembali ke tempat ini, aku melupakan rasanya memejamkan mata. Tentu saja karena aku lebih menyukai wajah tampannya ketika dia tertidur. Mungkin aku masih mencintainya. Ya, kurasa sangat mencintainya.\n" +
                "\tWaktu berlalu begitu cepat. Kali ini menunjukkan pukul 6 pagi. Ketika dia bangun dan menuju kamar mandi, aku buru-buru ke dapur. Membuka lemari makan dan mencari sesuatu yang bisa dimasak dan dimakan untuk sarapannya. Aku tidak menemukan apa pun kecuali stoples gula dan stoples garam. Akhirnya aku menuju ke kulkas dan menemukan beberapa roti tawar dengan pelengkap untuk membuat sandwich. Ya, dia sangat menyukai sandwich, aku sering membawakannya sandwich setiap pagi ke kamar apartemennya sebelum kami berangkat kuliah bersama.\n" +
                "\tAku memanaskan margarin pada wajan, kemudian menggoreng telur setengah matang. Selanjutnya memanaskan roti tawar pada panggangan. Ketika roti terlihat sudah kecokelatan, aku meletakkannya pada piring dan menyusunnya. Dimulai dari satu lembar roti bakar, kemudian daun selada, potongan tomat dan tanpa potongan mentimun. Dia tidak menyukai mentimun. Kemudian setelah potongan tomat, aku meletakkan telur yang sudah digoreng sebelumnya, menuangkan saus manis, saus pedas, mayonnaise, taburan sedikit keju dan menutup dengan selembar roti tawar. Sangat lengkap. Selanjutnya, aku meninggalkan sebuah catatan kecil. Aku harap dia menyukainya seperti dulu.\n" +
                "\tAku tidak kembali pada tempatku. Aku memilih ke ruang tamu, karena bersamaan dengan selesainya dia berganti pakaian setelah mandi, seseorang menekan bel kamar. Aku memerhatikan wajahnya dari layar belakang pintu. Penampakan yang sering aku lihat, seseorang di sana adalah orang yang foto-fotonya banyak dipajang di berbagai ruangan di kamar ini. Aku sudah menelusuri semuanya. Mulai dari kamar ada dua buah foto, ruang tamu ada sebuah foto besar, dan dapur hanya memiliki satu foto kecil. ”Sebentar!” teriak mantan kekasihku dengan tegas. Dia buru-buru berhambur keluar kamar dan menuju pintu apartemen. Dia sudah lengkap dengan pakaian kerjanya, hanya saja rambutnya yang basah masih bertopikan handuk.\n" +
                "\tPintu dibuka. Seorang wanita seumuran denganku masuk tanpa dipersilakan. Pria dengan rambut ditutup handuk itu menutup pintu, kemudian kembali menuju balkon untuk menjemur handuk. Setelah itu dia hendak menuju ruang tamu lagi, menikmati sarapan yang dibawa kekasihnya, namun dia terhenti di dapur. Mungkin, aroma sandwich buatanku mulai memasuki rongga-rongga ruang penapasannya.Dia terkejut ketika memerhatikan catatan kecil di sebelah piring sandwich, suara teriakannya yang tidak terlalu lantang tetap membuat kekasihnya datang ke arahnya.\n" +
                "\t”Ada apa, Lex?” tanya wanita itu tanpa panggilan sayang. Membuatku menjadi ingat ketika kita masih menjadi sepasang kekasih, Alex tidak suka dipanggil sayang atau semacamnya. Sebagai bukti, wanita itu memanggil kekasihnya hanya dengan sebutan nama, Alex. Telapak tangan kanan bagian kanannya, menyentuh bahu Alex.\n" +
                "\t”Kau membawakanku sandwich?” Alex balik tanya. Kekasihnya menggeleng. “Lalu, siapa yang meletakkan ini di sini? Apa seseorang yang ingin menyebarkan teror?!”\n" +
                "\tAlex menunjuk sandwich buatanku. Sesaat dia mampu membuatku sakit hati, hati ini teriris begitu saja dengan mudahnya, membuatku menangis dengan tertahan. Walaupun sebenarnya aku tahu, suaraku tak bisa didengarnya.\n" +
                "\t”Helena?” wanita itu membaca catatan kecil yang kubuat. Lebih tepatnya pada bagian bawah catatan, sebuah nama pengirim, namaku. \n" +
                "\t“Apa maksudnya ini? Helena? Kekasihmu yang mati kecelakaan itu? Orang konyol macam apa yang mempermainkan permainan bodoh seperti ini? Ha! Mana ada orang mati gentayangan! Pasti dia lagi sibuk disiksa di neraka!” wanita itu tertawa seenaknya. Aku geram. Namun, aku tidak bisa melawan. Namun, kudapati wajah Alex sama marahnya.\n" +
                "\t”Jangan berkata sembarangan tentang Helena!” Alex berteriak lantang di depan wajah kekasihnya. “Aku memang tidak percaya dengan hal semacam ini. Tapi, aku lebih tidak suka mendengar seseorang menjelek-jelekkannya! Dia adalah hal yang paling berharga di dunia ini. Melebihi siapa pun!” kata-kata Alex masih bernada tinggi, namun mampu membuatku sekaligus kekasihnya terdiam.Selama kematianku, bahkan dia masih sangat mencintaiku. Aku melangkah mendekatinya, membelai rambutnya yang hitam legam, meskipun itu hanya menembus saja. Aku mencium pipinya dan hal yang sama terjadi. Ini adalah hal paling utopis. Aku tidak bisa menggapainya bahkan ketika aku bisa melakukan apa pun.\n" +
                "\t”Helena?” suara Alex terdengar lirih. Apa dia bisa merasakan keberadaanku?\n" +
                "\tKekasihnya terdiam. “Kau sudah benar-benar gila, Lex! Hubungan kita berakhir di sini! Aku tidak sudi diselingkuhi olehmu hanya karena setan gentayangan!” wanita itu berhambur pergi, mengambil bekal makanan dan juga tas jinjingnya.\n" +
                "\tAlex tak mendengar ucapan marah dari kekasihnya. Dia memanggilku kembali. “Helena?” suaranya masih sama-sama lirih seperti tadi. Aku bingung harus melakukan apa, namun Alex benar-benar menyadari keberadaanku.\n" +
                "\tAkhirnya, kuambil sebuah buku catatan di ruang tamu dan kembali. Kuterbangkan sebuah catatan di hadapannya. Catatan itu berisi tulisan. Aku di sini, Lex. Apa kau baru menyadari kalau aku selama tiga tahun ini berada di sampingmu? Alex membaca perlahan catatan itu, dia selalu takut dengan hantu dan aku sadar aku telah membuatnya takut. Namun, ada secercah senyum di bibir manisnya.\n" +
                "\t”Kenapa baru sekarang datang? Kenapa tidak sejak dulu? Kenapa kau biarkan aku mengkhianatimu dengan seorang wanita sialan sepertinya! Aku tidak pernah mencintai wanita itu! Aku hanya mencintaimu, Helena!” teriakan dengan deru napas dan diiringi tangis yang mengucur di sudut matanya menampakkan cahaya kemilau yang sangat terang. Hingga aku pun silau melihatnya.\n" +
                "\tSemenit kemudian, aku bisa melihat Alex dengan jelas. Bahkan, senyum yang lebih manis ada di bibirnya. Aku merindukan senyum yang entah berapa lama tak pernah aku lihat lagi. Tidak. Ini bukan senyum yang seperti kubayangkan. Dia sedang tersenyum padaku. Dan, dia mampu memelukku dengan erat. Apakah ini mimpi? Namun, sebagai hantu gentayangan, aku tidak mungkin bisa tertidur apalagi bermimpi? Lalu, apakah ini kenyataan? Bagaimana bisa? Entah ekspresi apa yang harus kusuguhkan. Aku benar-benar senang merasakan pelukan dari seseorang yang sangat kucintai ini. Karena ini benar-benar nyata. Bukan angan seperti biasanya. Utopiskah? Absolut\n" +
                "Wajah Alex terlihat penuh senyum bahagia setiap harinya setelah kedatanganku sebulan yang lalu. Ya, sebulan penuh dia sangat bahagia. Dia selalu berkata bahwa penantiannya selama tiga tahun tidak sia-sia. \n" +
                "Bahwa pengharapan dan keteguhan hatinya yang tetap mempertahankan cintanya untukku tidak pernah sia-sia. Sebenarnya, aku tahu betul bukti itu, karena selama tiga tahun aku bersamanya, meski hanya menjadi sebuah penonton yang sedang menonton aktor memainkan skenarionya.\n" +
                "”Siapa yang sedang kau perhatikan, Lex?” pertanyaan itu milik, Matthew, dia adalah teman Alex sejak SD. Aku cukup mengenalnya.Mendengar pertanyaan itu, Alex hanya senyum-senyum sambil memandangiku penuh rasa bahagia. Rasanya, dia mulai benar-benar gila, seperti apa yang dikatakan Matthew. Aku memerhatikan Alex sambil tertawa.\n" +
                "”Apa sebulan putus dengan Evelyn membuatmu gila?” Alex masih tidak menjawab. “Habiskanlah makananmu. Waktu makan siang kita hampir habis. Bos akan marah besar jika kita telat masuk kantor.” Ujar Matthew lagi. Dia begitu cerewet.\n" +
                "”Aku tidak lapar. Pergilah lebih dulu.” Alex mendorong sepiring Taco padaku yang berada tepat di hadapannya. Matthew yang duduk di sebelahnya hanya bingung.Ketika Alex menatapku untuk menghabiskan makanan di hadapannya, aku langsung bergegas memenuhi perintahnya. Matthew sedang mengalihkan pandangan, ketika bersamaan. Piring itu kudorong hingga ke depan Alex. Agar terlihat Alex yang menghabiskannya. Permainan kecil ini membuatku senang. Namun, tak akan kulakukan lagi di depan umum, aku takut banyak orang yang menjauhi Alex.\n" +
                "”Akhirnya kau menghabiskannya juga. Sangat cepat dan bersih.” Matthew bangkit dan berlalu meninggalkan Alex yang belum juga bangkit dari tempat duduknya. Lelaki berambut pirang itu sudah meninggalkan Alex.Aku tersenyum memerhatikan tingkat kedua sahabat ini. Mereka sering sekali bertengkar, meskipun hanya pertikaian kecil yang mereka sukai. “Kau itu bukan hantu. Masih seperti bidadari yang sama sejak tujuh tahun yang lalu aku mengenalmu. Dan, kali ini aku beruntung. Hanya aku yang bisa melihat kecantikanmu. Mereka tidak berhak melihatmu.\n");

        judulNovel.add("History");
        genreNovel.add("Sejarah");
        coverNovel.add("https://a.wattpad.com/cover/62856675-144-k102812.jpg");
        karyaNovel.add("Sitichoirunnisa");
        infoNovel.add("87,56 FM History Radio… alunan musik pembuka khas radio swasta yang mengudara di Gedung Phinsi Tower lt. 4 Makassar College. Sebenarnya radio ini dikelola oleh Biro Hiburan dan Informasi – Himpunan Mahasiswa Jurusan History & Cultural Study, yang dimana Kepala Bironya adalah mantan Residen Himpunan (Ketua Himpunan). Ferdiadi, S.Hum. Sebuah kebiasaan atau tradisi eks Residen Himpunan akan memegang jabatan Biro ini, pemberian jabatan ini sebagai penghormatan kepada mantan Residen Himpunan.\n" +
                "“yah baiklah Irwan 20 detik lagi kita mengudara” sahut Ferdi di balik Director Room bersama beberapa official radio. Irwan mengacungkan jempolnya sebagai pertanda ia siap untuk menjadi penyiar radio malam ini.\n" +
                "“oke 3… 2… 1… and cue”\n" +
                "“yah selamat malam para pemirsa History Radio FM dalam acara Curhatan Tengah Malam, dimana motto kami ialah -mendengar curhatan karena kami peduli-” sahut Irwan, Ferdi mengacungkan jempol kepada Irwan di balik kaca Director Room.\n" +
                "“kalau minggu lalu saya ditemani Muhammad Hidayat, penyiar yang unyu-unyu, kali ini saya ditemani pria ganteng dari pinggir Kota Makassar yang tenang dan damai mari kita sambut Syahrul si penguasa Negeri Tallo dengan memberikan tepukan yang meriah kepada Syahrul” sahut Irwan dengan penuh semangat mengudara malam ini, Syahrul sendiri hanya menyikut Irwan yang berkelakar mengenai dirinya.\n" +
                "“yah halo pemirsa sekalian kali ini saya menemani Irwan, kenapa saya yang menemaninya? katanya sih partenrnya sakit karena pekan lalu tidak bisa tidur mendengarkan curhatan horor salah satu pendengar History Radio FM” Kelakar Syahrul, Irwan hanya terkekeh mendengar pengutaraan kawan karibnya.\n" +
                "“nah buat para pemirsa sekalian yang ingin berbagi curhatan malam ini silahkan hubungi 089665235***” sahut Irwan dengan suara khas nan seksi. Selain konsep acara salah satu daya tarik dari acara radio ini adalah suara khas dan sexy dari sosok Irwan.\n" +
                "“kalau para pendengar tidak ada pulsa tapi hanya memiliki Kuota boleh mention di Fan Page FB kita loh di History Radio_CTM atau mention di Twitter @CTM_Historyradio” sahut Syahrul yang suaranya tidak kalah seksi dengan Irwan\n" +
                "Di Director Room Ferdi memerhatikan tabletnya yang menampilkan rating acara malam ini. “yah jika terus begini kita bisa meraih posisi pertama lagi atau rating tertinggi, untuk sementara share kita 25/100” sahut Ferdi kepada beberapa Official Radio\n" +
                "“maaf kanda sebelumnya saya masih bingung yang dimaksud 25/100 itu?” tanya salah satu Official Radio yang merupakan Mahasiswa semester VII History & Cultural Study Makassar College.\n" +
                "“itu artinya dari 100 orang yang mendengar Radio malam ini, 25 diantaranya memilih mendengarkan History Radio”\n" +
                "Kembali kepada dua penyiar bersuara sexy tersebut. “Syahrul nampaknya ada yang mention di Fans Page kita nih”\n" +
                "“ya udah mari kita baca curhatannya”\n" +
                "Selamat malam kakak-kakak bersuara seksi, perkenalkan namaku Mujahidin aku mau curhat nih, saya tidak tahu apakah saya termasuk laki-laki brengsek atau apakah? Tapi saya juga bingung pada diri sendiri menyukai dua gadis cantik sekaligus, satu teman seangkatan saya di kampus, satunya lagi adik kelas saya di kampus, selama ini saya selalu main kucing-kucingan kalau berhubungan dengan permasalahan percintaan di antara kedua gadis itu. Mau putuskan pacar pertama sayang karena sudah menjalin kasih 4 tahun, pacar kedua pun begitu, cantik, pintar, dan pokoknya wah deh, tapi saya bingung harus memutuskan? Apakah memilih pacar pertama, pacar kedua atau sekalian saya lanjutkan status quo ini, memacari kedua-duanya? Terimah kasih kakak-kakak sekalian sudah mendengarkan dan membcakan curhatanku, sekian\n" +
                "“wah luar biasa yah Syahrul menurutmu bagaimana dengan kasus ini?” tanya Irwan kepada syahrul yang sedari tadi memerhatikan Irwan membaca curhatan salah satu pendengar\n" +
                "“yah kalau menurut saya untuk Bro Mujahidin sebaiknya sholat Istighoroh deh minta petunjuk sama Allah SWT mana yang cocok dihatimu, kan jahat loh menduakan perasaan perempuan” sahut Syahrul dengan nada yang bijak seperti om Mario Tehgoek\n" +
                "“yee kamu sendiri punya pacar lebih satu” kembali Irwan berkelalakar terhadap partner siarannya malam ini\n" +
                "“yee gosip murahan dari mana tuh? Saya ini orangnya setia, cukup satu pacar saja”\n" +
                "“ya udah deh, jadi dengarkan Bro Mujahidin kamu harus memantapkan hati pada satu pilihan, kalau sudah menikah minta izinlah dengan isterimu untuk menikahi mantan pacarmu” kembali kelakar khas dari Irwan terlontarkan yang membuat Syahrul sedikit terkekeh, begitu pula beberapa Official Radio\n" +
                "“yah kamu tuh Irwan bercanda terus” sahut Syahrul\n" +
                "“yah setelah kita dengarkan curhatan Bro Mujahidin kita rehat sejenak, sebuah lagu untuk para pendengar sekalian Desember Kelabu dari Yuni Sara”\n" +
                "Syahrul dan Irwan sejenak keluar dari studio menuju Director Room bermaksud bertemu dengan Ferdi\n" +
                "“gimana Fer? kami berdua menyiarnya bagus tidak?” tanya Irwan kepada Kepala Biro yang bertanggungjawab penuh atas History Radio FM\n" +
                "“sejauh ini lumayan, share rating kita sudah mencapai 29/100 walaupun demikian acara ini masih menduduki posisi kedua di slot jam mengudara ini” sahut Ferdi\n" +
                "“yah setidaknya kelakar khas dari Irwan dan sikap bijak dari Syahrul menjadi racikan pas dalam acara ini, kalian berdua memang penyiar yang hebat” puji Ferdi dan memberikan kode kepada mereka berdua untuk bergegas kembali ke studio untuk ON-Air kembali\n" +
                "“yah 3… 2… 1… and cue” aba-aba Ferdiadi kepada Irwan dan Syahrul yang sudah Stand By.\n" +
                "“nah setelah rehat sejenak kita kembali lagi, wah-wah-wah di Twitter kita banyak yang mention ada yang kirim salam, alangkah baiknya kita baca satu persatu tweet pendengar sekalian” Syahrul kemudian membacakan satu persatu tweet yang di mention ke akun twitter @CTM_Historyradio\n" +
                "“dari @nurqalbi salam untuk teman-teman sekalian di Humaniora Faculity Makassar College Happy Graduation” setidaknya Syahrul dan Irwan bergantian menyebut satu persatu tweet yang masuk, kurang lebih ada 20 mentio-nan yang dibaca\n" +
                "“wah banyak juga yah” sahut Irwan, di Director Room Ferdi memberikan sinyal kepada Syahrul bahwa akan ada telpon masuk, dan telponpun berdering.\n" +
                "“yah selamat malam” sahut Syahrul dengan nada yang ramah\n" +
                "“Assalamualaikum, Selamat Malam para penyiar sekalian” sahut suara pria diujung line Phone\n" +
                "“waalaikumsalam, selamat malam dengan siapa dan nimana yah?” sahut Irwan\n" +
                "“dengan Helmy disini, kamu boleh panggil saya Bro Helmy karena usiaku baru 25 Tahun” sahut sebuah suara yang bernama Helmy\n" +
                "“oh dengan Helmy, kalau boleh tahu Helmy lagi dimana nih?”\n" +
                "“di rumah” jawab helmy dengan nada datar di ujung line phone\n" +
                "“yee Bro Helmy maksud kami itu alamatnya” sahut Syahrul\n" +
                "“di Sungguminasa” sahut Helmy dengan nada yang dingin\n" +
                "“oke Bro Helmy mau curhat apa nih?” tanya Irwan\n" +
                "“sebenarnya saya mau cerita pengalaman saya ketika bertemu dengan hantu?!”\n" +
                "“boleh boleh, sepertinya menarik” sahut Syahrul yang sangat antusias lain halnya Irwan yang mulai merasakan hal yang aneh, entahlah mungkin ini hanya perasaan Irwan.\n" +
                "“ceritanya begini… Malam itu saya masih ingat hujan turun sangat deras, di arloji saya sudah menunjukkan pukul 22.45”\n" +
                "Pukul 22.45 di salah satu gedung pencakar langit kota Makassar\n" +
                "“yah hujannya deras mana tidak bawah payung lagi” sahut Helmy di lobby Kantor berlantai 17 yang berada di jalan AP Pettarani\n" +
                "“yah mau gimana lagi pak sepertinya kita harus menunggu lama disini” sahut salah satu karyawan yang berkantor di lt 4. Sama dengan Helmy yang berkantor di lt.4\n" +
                "“kita harus menunggu lama” sahut Helmy, angin berhembus lebih kencang entah mengapa Helmy merasakan suasana yang agak aneh, oh rupanya perutnya menunjukkan tanda-tanda panggilan alam\n" +
                "“kenapa malam-malam begini ada panggilan alam” gumam Helmy dan memegang perutnya, beberapa menit kemudian Helmy memutuskan untuk mencari toilet terdekat, ia menyusuri lobby di lt. 1. Sesampainya di salah satu sudut ruang Toilet, Helmy nampak menghembuskan nafas yang panjang.\n" +
                "-Maaf Untuk Sementara Toilet Ini Tidak Dapat Digunakan-\n" +
                "Sebuah tulisan di dekat pintu masuk membuat Helmy sedikit kesal\n" +
                "“aneh, Toilet ini kok tidak dapat digunakan…?!” sahut Helmy, yang kemudian menuju lift kantor menuju lt. 4, memencet tombol 4, 10 menit keheningan menyelimuti Helmy selama menunggu di dalam lift, ada aura aneh yang dirasakan, Helmy melirik arlojinya yang telah menunjukkan Pukul 22.55\n" +
                "“kenapa dingin yah?”\n" +
                "Kini Helmy sudah berada di lantai 4, menyusuri koridor yang sepi dan menuju toilet yang berada di samping gudang “kantor ini kalau sepi seram juga yah” sahut Helmy, ketika memasuki Toilet lagi-lagi Helmy merasakan aura yang aneh, seperti ada seseorang yang mengawasinya dari belakang.\n" +
                "“aduh mau buang hajat saja kenapa suasanaya seram begini” sahut Helmy yang sudah mengambil posisi PW di Toilet, selama proses “panggilan alam itu” Helmy mulai gusar dan gelisah, ia mendengar suara langkah kaki, pelan… pelan… lalu suara itu serasa mendekati toilet yang ditempati Helmy, keringat dingin mulai mengucur ketika suara langkah kaki itu semakin terdengar dan Helmy merasakan sosok aneh itu tepat berada didepan pintu toiletnya, tiba-tiba knop pintunya terbuka dan….\n" +
                "“Haaaaaaaa” Helmy berteriak sekeras-kerasnya begitu pula sosok di depannya\n" +
                "“Haaaaaaaaaaaaaaa”\n" +
                "“Aichh Anj*ng kau bikin kaget saja Pak Izar” sahut Helmy kepada kepala kebersihan Kantor, Pak Izar.\n" +
                "“Maaf pak” sahut Pak Izar kemudian menutup kembali pintu toilet tersebut\n" +
                "“Pak Izar bikin kaget saja” setelah insiden itu Helmy kemudian berjalan menuju westafel Toilet dan mencuci tangannya, ia melihat Pak Izar yang sedang membersihkan beberapa sudut toilet\n" +
                "“Pak Izar sekarang bapak bisa membersihkan toilet yang saya gunakan tadi” sahut Helmy dengan nada sedikit kesal\n" +
                "“Iya pak dan maaf sebelumnya saya kira tidak ada orang tadi” sahut Pak Izar\n" +
                "“yah sudah lupakanlah dan pastikan kamu tidak mengingat kejadian tadi” sahut Helmy dengan wajah yang merah padam, mungkin karena malu?!\n" +
                "Helmy kemudian keluar dan menuju lantai satu, namun sepanjang perjalanan ia masih memikirkan sesuatu, “hmm Pak Izar kenapa wajahnya pucat sekali yah, bibirnya agak membiru” Helmy berjalan menuju pintu keluar kantor, namun aneh di sana banyak polisi dan terparkir sebuah mobil ambulan, Helmy mendekati salah satu petugas polisi yang sedang berdiri dekat pintu\n" +
                "“maaf pak ada apa ini kenapa banyak polisi di luar?” tanya Helmy\n" +
                "“ohh begini pak 60 menit lalu kami mendapat panggilan dari pihak keamanan kantor bahwa ada mayat ditemukan di kantor ini”\n" +
                "“Astaga ya tuhan, kalau boleh tahu korbannya siapa yah dan dimana ditemukan mayatnya?”\n" +
                "“Korbannya namanya Pak Izar kepala kebersihan kantor ini, mayatnya ditemukan di Toilet lantai 1 kantor ini sekitar pukul 22.55” Helmy kaget dan tersentak, wajahnya pucat mendengar berita kematian ini.\n" +
                "“maaf pak sebelumnya kalau boleh… saya ingin melihat kondisi si mayat?” tanya Helmy kepada petugas tersebut, dan mereka berdua menuju mobil Ambulance yang beberapa menit lagi akan berangkat.\n" +
                "“silahkan pak, tapi kami mohon bapak mensegerakan karena kami harus secepatnya mengautopsi korban” sahut Petugas tersebut, Helmy menyibak kain putih yang menutup tubuh mayat itu, dilihatnya wajah Pak Izar yang pucat dan bibirnya membiru…\n" +
                "“wah serem amet yah ceritanya Bro Helmy” sahut Syahrul\n" +
                "“iya itulah curahatanku malam ini dan terimah kasih buat para penyiar yang sudi mendengarkan ceritaku” sahut Helmy yang kemudian menutup Line Phone nya.\n" +
                "Syahrul sedikit terkekeh ketika melihat mimik wajah Irwan, wajahnya dipenuhi peluh… keringat dingin.\n" +
                "“yah baiklah para pendengar sekalian cerita dari Bro Helmy mengakhiri pertemuan kita dalam Curhatan Tengah Malam, saya Syahrul dan rekan saya…”\n" +
                "“Irwan…”\n" +
                "“sampai berjumpa pekan depan” sahut Irwan dan Syahrul menutup acara siaran radio Curhatan Tengah Malam.\n" +
                "Di Director Room Ferdiadi memberikan acungan jempol kepada mereka berdua sebagai pertanda suksesnya siaran malam ini.\n" +
                "“Irwan mau kemana?” tanya Syahrul\n" +
                "“mau ke toilet sebentar” sahut Irwan.\n" +
                "Tak berselang lama Irwan pun sudah berada di dalam toilet, ia sejenak memerhatikan suasana dalam toilet tersebut dan menuju bilik untuk memuaskan hajatnya.\n" +
                "“aduh kok ini toilet tiba-tiba seram yah?” sahut Irwan yang sudah mengambil posisi PW\n" +
                "Selama proses panggilan alam itu Irwan merasakan suasana ganjil, beberapa kali lampu mati dan menyala sendiri, terdengar suara-suara kaki melangkah, semakin dekat… semakin dekat… dan semakin dekat, wajah dan tubuh irwan mulai dibanjiri keringat dingin, ketika ia mendengar suara langkah semakin mendekat dan tiba-tiba knop pintu toilet berputar dan Irwan menatap nanar apa yang dipandanginya.\n" +
                "“Haaaaaaaaaaaaaaaa” teriak Irwan dan orang yang membuka pintu itu, sebuah teriakan terdengar jelas dari toilet yang di “tumpangi” Irwan.\n" +
                "“Kampret loh Irwan” sahut suara gadis sambil menutup matanya, Irwan hanya salah tingkah dibuatnya, gadis itu menutup kembali pintu toilet, beberapa orang bergegas datang menuju Toilet tersebut, gadis itu berdiri di depan pintu toilet dengan wajah yang pucat pasi\n" +
                "“kenapa kamu Vivi?” tanya Ferdi dan beberaoa Official Radio\n" +
                "“Kampret si Irwan, dia bego atau tolol?! bisa-bisanya ia masuk Toilet cewek, Bok*r lagi” sahut Vivi, semua Official Radio tertawa terbahak-bahak mendengar insiden tersebut.\n" +
                "“jangan-jangan karena cerita Bro Helmy, Irwan jadi ketakutan, saking takutnya dia lupa mana Toilet Cowok dan Toilet Cewek…?!!!” sahut Ferdi yang diiringi gelak tawa untuk kesekian kalinya oleh beberapa Official Radio.\n" +
                "\n");

        judulNovel.add("Petrichor");
        genreNovel.add("Fiksi Remaja");
        coverNovel.add("https://a.wattpad.com/cover/29728379-176-k143788.jpg");
        karyaNovel.add("Angelaftracta");
        infoNovel.add("Aku melangkah agak tergesa-gesa karena ingin segera sampai ke tempat tujuanku. Aku ingin segera sampai, aku tidak akan percaya dengan kabar itu jika aku tidak melihatmu dengan mata kepalaku sendiri. Aku ingin segera sampai ditempatmu. \n" +
                "Aku terus melangkah hingga setetes air yang jatuh dari langit menghentikan langkahku. Mulai dari setetes air dari langit, disusul oleh tetes-tetes air lainnya. Gerimis menyenandungkan melodi yang kurindukan, meniupkan aroma yang membuat ingatanku melayang ke masa lalu. \n" +
                "“Petrichor...” Gumamku.  \n" +
                "Tiga tahun lalu (2011)  \n" +
                "Aku dan kamu berbeda. Aku hanyalah gadis kutu buku, juara umum sekolah yang kurang pergaulan. Aku tidak pandai bersosialisasi. Karena aku tak punya teman untuk bermain, sebagian waktuku kuhabiskan untuk persiapan tes masuk perguruan tinggi.\n" +
                "Aku sudah menerima banyak pandangan kekaguman, kekaguman akan kepintaranku. Tatapan itu berasal dari orang tua dan guru-guru di sekolah ini. Tatapan yang membuatku tersiksa. Mereka terlalu berharap banyak. Orang tuaku terus-terusan meneriaki nama kampus-kampus favorit di Indonesia maupun di dunia. Tak tahukah mereka kalau aku hanya ingin mendirikan taman kanak-kanak disini? \n" +
                "Banyak juga yang memberiku tatapan kebecian. Kebencian yang diawali dengan perasaan iri. Tatapan ini kudapatkan dari kebanyakan siswa di sekolah ini. Kebencian yang membuatku semakin tidak percaya diri jika harus bersosialisasi dengan mereka.  \n" +
                "Sedangkan kau? Kau berbeda, meskipun kau hanya berbeda satu peringkat dibawahku, kau pandai sekali berteman. Aku tidak tahu banyak tentangmu saat itu. Yang kutahu, kau adalah lelaki periang yang sekelas denganku. Kau jugalah yang tak pernah memberiku tatapan penuh kebencian itu. Kalau boleh kubilang, matamu adalah salah satu pasang mata yang meneduhkan untukku.\n" +
                " “Hai.” Sapamu saat kita tak sengaja bertemu di lobby sekolah. “Sendirian? Ngapain?”\n" +
                "Aku salah tingkah. Bukan karena aku grogi di hadapan lelaki ini, aku memang SELALU salah tingkah didepan semua orang.\n" +
                " “Nunggu sopir.” Jawabku singkat. \n" +
                "Tak lama kemudian titik-titik air turun dari langit, gerimis. Membawa aroma kesukaanku, aroma gerimis. \n" +
                "“Aku duluan ya.” Katamu sambil bersiap berlari. Aku tidak membalas perkatannya tetapi mataku menunjukkan penolakan. Aku tidak mau kau kebasahan dijalan pulang. \n" +
                "“Nggak pa-pa, cuma gerimis.” Katamu seakan-akan kau bisa membaca pikiranku. “Tapi kalau kamu mau aku temenin nunggu sopir, aku bisa kok.” \n" +
                "Aku terdiam, tidak menolak tapi juga tidak mengiyakan. Kulihat kau sudah menanggalkan jaket, mengurungkan niat untuk menerobos gerimis yang sekarang sudah berubah menjadi hujan. \n" +
                "Petrichor.” Gumamku saat aku menghirup aroma hujan kesukaanku. Kututup mataku dan kuhirup aromanya dalam-dalam. \n" +
                "Meskipun hanya sebentar, menutup mata sambil menghirup aroma hujan dalam-dalam merupakan hal yang menyenangkan bagiku. Aku bisa melupakan semua kebencian dan beban yang ditujukan kearahku saat aku mencium aroma hujan.\n" +
                "“Kamu suka hujan ya?”\n" +
                " Aku menggeleng. “Bukan hujannya, tapi aromanya.” Tak bisa kujelaskan kenapa aku menyukai aroma hujan. Aroma yang hanya tercium apabila tanah dan aspal sudah lama tidak diguyur hujan. Aroma debu yang terangkat itu selalu menggelitik benakku. Aroma yang tericium saat tanah yang kering menerima tetes air hujan seakan-akan membawa harapan baru di tengah kekeringan.\n" +
                " Kami berdua terdiam lagi. Aku memang tidak pandai mengobrol dan berbasa-basi meskipun kau terus berusaha mengajakku mengobrol hingga akhirnya sopirku datang. \n" +
                "“Eh, tuh sopir kamu udah dateng. Kalau gitu, aku pulang dulu ya.” \n" +
                "Belum sempat aku menawarkannya untuk menumpang di mobilku kau sudah berlari menerobos hujan.  Aku menatap sosokmu dari belakang. Baru kusadari bahwa tas ranselmu itu sudah putus dan hanya dikaitkan peniti. Setelah kuingat lagi, baju seragamu juga lusuh, tak lagi putih. Belum lagi sepatumu. Mungkin benar kata mereka. Kau adalah si pintar yang kurang beruntung. Lahir di tengah keluarga yang serba kekurangan.\n" +
                " Apalah hebatnya aku, si juara umum karena aku selalu belajar. Belum lagi les privat mahal di instansi swasta yang selalu kujalani sepulang sekolah. Jika dibandingkan denganmu yang pintar karena bakat alamimu, aku sama sekali bukan apa-apa.\n" +
                " Menjelang kelulusan, kau dan aku semakin akrab. Perlahan aku mulai membuka diri kepadamu. Hal ini tak lepas dari usahamu untuk terus memaksaku membuka diri padamu.\n" +
                "“Jadi? Kamu lanjut kuliah kemana? Tetep di Indonesia atau going abroad mungkin?” Kau bertanya saat kita menghabiskan makan siang berdua.\n" +
                "Aku menggeleng. Aku belum tahu ingin melanjutkan kuliah dimana. Orang tuaku selalu berharap banyak. Harapan mereka yang selalu menjadi beban untukku. Tak kubilang padamu kalau orang tuaku sudah menyiapkan pendidikan di Jerman untukku di jurusan yang sama sekali tidak kuinginkan.\n" +
                " “Kamu kan pinter, kamu bisa masuk kampus favorit” \n" +
                "“Kamu juga bisa.” \n" +
                "Kau menggeleng. “Aku mau masuk sekolah kedinasan. Sekolahnya gratis, siswanya digaji malahan, jadi aku nggak perlu pusing mikirin biaya. Hahaha.” Kau tertawa tapi di telingaku tertawamu itu justru menyayat hatiku. Tanpa kau bilangpun aku tahu. Kau iri padaku, pada teman-teman kami yang bisa memilih tempat kuliah. Sedangkan kau sendiri, pilihanmu terbatas. Biaya, masalah klasik itu selalu menjadi alasan.\n" +
                " Sungguh ironis, kau yang bahkan lebih pintar dari sebagian besar siswa di sekolah ini justru tak bisa memilih jalan hidupmu.\n" +
                " “Hei, kok diem?” \n" +
                "Aku tersentak dari lamunanku. Sekolah kedinasan. Banyak kabar miring yang kudengar tentang sekolah itu tentang penganiayaan siswa. Belum lagi pelatihan bak militer yang harus diterima oleh siswanya.\n" +
                " “Bagi kamu, aku ini apa?” Aku tidak betul-betul bertanya sebenarnya. Aku hanya ingin mengalihkan lamunanku tentang sekolah kedinasan yang akan kau masuki. \n" +
                "“Hmm, kalau aku bilang &apos;inspirasiku&apos; kedengerannya muluk banget ga sih?” Lagi-lagi kau tertawa dan aku kembali terdiam. Inspirasi, sebegitu hebatnyakah aku dimatamu?\n" +
                " “Sekarang aku gantian nanya, bagi kamu, aku ini apa?”\n" +
                " Entah hanya timing yang tepat, atau ini memang rencana Tuhan. Gerimis muncul di saat yang tepat saat aku menatap jendela. Dari sela-sela jendela, tercium aroma kesukaanku.\n" +
                " “Petrichor.” Jawabku.\n" +
                " “Hah? Petrichor? Apaan tuh?”\n" +
                " Aku tak menjawab. Aku tak sanggup mengatakan padamu bahwa aku selalu menyebutmu sebagai “petrichor-ku”.  Kau bagaikan aroma hujan yang selalu kurindukan saat aku dilanda kekeringan. Aroma yang membuatku melupakan kebencian yang terarah padaku. Aroma yang bisa membuatku melupakan beban hasil dari harapan-harapan muluk itu. Kau lebih dari sekedar inspirasiku, kau adalah hidupku. \n" +
                "Ya, aku telah jatuh cinta padamu. Sejak pertama kau menyapaku di lobby sekolah itu. Kau sosok yang kurindukan di kekeringanku. Sorot mata yang menenangkanku diantara sorot mata yang menatapku penuh kebencian. Sosok yang membuatku melupakan beban di pundakku saat aku berada didekatmu.\n" +
                " “Aku ingin bisa selalu ada di dekatmu.”\n" +
                "Hujan belum berhenti saat aku tiba didepan sebuah makam. Makam dengan batu nisan yang bertuliskan namamu. \n" +
                "Aku menangis sejadi-jadinya. Mau tak mau aku harus percaya kabar itu setelah aku melihat sendiri makam yang masih merah itu. Kau sudah didalam sana, terbujur kaku. \n" +
                "Ya, dialah, petrichor-ku. Berita kematiannya terdengar hampir di seluruh penjuru negeri ini.\n" +
                "Begitu aku membaca berita di internet, aku langsung terbang ke Indonesia. Luka lebam akibat benda tumpul di bagian perut dan dada yang menyebabkan rusaknya organ bagian dalam. Setelah terbaring 11 hari di ICU, kau menghembuskan nafas terakhir di rumah sakit. Korban penganiayaan oleh senior di sekolah kedinasan. Begitu kata berita yang kubaca. \n" +
                "Hujan semakin deras. Kini aroma khas gerimis itu lenyap seiring dengan semakin lebatnya hujan ini. Hujan yang membawa pergi aroma kesukaanku, membawa pergi kau yang kurindukan. \n" +
                "“Selamat tinggal petrichor-ku.”\n" +
                "\n");

        judulNovel.add("Driving Me Crazy");
        genreNovel.add("Fiksi Remaja");
        coverNovel.add("https://a.wattpad.com/cover/76722531-176-k659626.jpg");
        karyaNovel.add("Selvinasalsabila");
        infoNovel.add("Meta meletakkan pena yang sedari tadi ia gunakan, lalu kembali melihat hasil dari pekerjaan nya sebentar ini. Meta mengulum senyum saat kembali membaca kertas yang kini telah di penuhi coretan itu. Tidak ada hujan maupun badai, tapi kata-kata manis nan puitis itu terlintas begitu saja di benaknya pagi ini, saat ia menatap wajah tampan suaminya, yang saat ini masih meringkuk di bawah selimut di ranjang mereka.\n" +
                "Meta merasa sedang ber-nostalgia, kilasan-kilasan kepingan memori masa lalu memenuhi otaknya, merasuk tajam ke dalam sukma nya dan menembus hati terdalamnya. \n" +
                "Bagi Meta, Jeje adalah segalanya. Jeje adalah karunia paling indah yang telah Tuhan berikan pada Meta. Walau pada awalnya, jalan mereka tak seindah cerita-cerita roman picisan, tak seromantis Romeo dan Juliet, juga bukan cerita yang mampu membuat para ibu-ibu menitikkan air mata karena merasa terharu. Tapi bagi Meta, apa yang ia lalui bersama Jeje selama ini lebih dari itu semua. Tidak ada yang dapat menggambarkan bagaimana rasa bahagia nya Meta, mendapati Jeje di sisinya selama ini\n" +
                "Meta beranjak dari duduknya, lalu menghampiri Jeje yang masih terbang di alam mimpi. Meta ikut berbaring diatas ranjang, memposisikan diri untuk menghadap kearah Jeje, menatap wajah Sang Pangeran tampan nya. \n" +
                "Tidak pernah terpikirkan oleh Meta dahulu, cowok yang sudah bertahun-tahun menjadi sahabat karib nya itu kini masih menjadi sahabat nya dan akan selamanya begitu. Dulu, mereka juga sahabat, sahabat seperti yang biasa di miliki orang-orang pada umumnya, sesederhana itu. Tapi sekarang, Jeje adalah sahabat Meta, sahabat hidup Meta lebih tepatnya.\n" +
                "Masih tidak Meta sangka, malam hari itu Jeje datang ke rumahnya dengan membawa Mama dan Papa nya. Datang menghadap keluarga Meta, untuk meminta Meta menjadi istri nya. \n" +
                "Bukan main rasa kesal Meta pada malam itu, ia kira ucapan Jeje tempo hari yang bilang akan melamarnya ternyata memang serius. Jeje sampai berani bawa ke dua orangtua nya ke hadapan keluarga Meta. Kurang sial apa lagi Meta! Ingin hati menolak dan meneriakkan sumpah serapah di wajah tampan Jeje saat itu, yang sudah lancang melamar nya tanpa memberi tahu Meta. Iya sih, Jeje sahabatnya. Dan Meta juga sayang pada Jeje, tapi kan cuma sebatas sayang sebagai sahabat. Ga lebih.. Dan Meta kira, lamaran Jeje tempo hari yang di ucapkan layaknya bercandaan itu juga ga serius. Tapi nyatanya?! Jeje benar-benar serius.\n" +
                "Meta masih ingat dengan jelas, kata-kata yang di lontarkan Jeje pada malam itu, saat ia mencoba menghakimi Jeje akan tindakan nekatnya melamar Meta. \n" +
                "“Emang apa salahnya sih kalau kita menikah? Kamu sayang sama orangtuaku dan orangtuaku juga begitu, kita udah kenal satu sama lain hampir sepuluh tahun Meta! Bunda juga udah merestui niatku waktu aku bilang tentang hal ini seminggu yang lalu” jelas Jeje saat itu. \n" +
                "Meta yang mendengar hal itu pun, saat itu sontak membalas ucapan Jeje dengan tak kalah sengitnya “Ya, kamu memang bener tentang aku yang udah sayang pake banget sama Mama Papa, dan aku tau mereka pun juga begitu. Aku juga tau, Ayah Bunda juga udah sayang sama kamu. Tapi pernikahan bukan hanya sebatas itu Je! Ini tentang kita, tentang waktu yang akan kita lewati disisa hidup kita selanjutnya” \n" +
                "“Aku nggak masalah dengan itu, aku bawa kedua orangtuaku ke sini tentu aja dengan banyak pertimbangan,Ta. Tentang kemungkinan apa yang terjadi sama hubungan kita, termasuk apa yang kamu bilang barusan. Aku udah siap lahir bathin, berdua.. ngabisin sisa waktu aku sama kamu” balas Jeje penuh keyakinan, yang membuat Meta bungkam seketika \n" +
                "“Ta-tapi.. gimana kamu bisa seyakin ini? Sementara kamu tau baik aku ataupun kamu nggak punya rasa satu sama lain” ucap Meta lirih. \n" +
                "“Kita punya, rasa sayang antara sahabat yang selama ini kita miliki satu sama lain. Dan bagiku, itu cukup sebagai pondasi dasar untuk memupuk rasa yang kita butuhkan selanjutnya” terang Jeje saat itu. \n" +
                "Dan semuanya berjalan begitu saja, Jeje berhasil meyakinkan Ayah Bunda Meta, juga meyakinkan Mama Papa nya. Sehingga mereka menjadi sepasang insan yang sudah sah, baik di mata agama maupun hukum. \n" +
                "Tak mudah memang awalnya, menghadapi situasi canggung yang jelas terasa diantara mereka berdua. Tapi entah mengapa, seiring waktu berjalan, rasa sayang diantara mereka bermetamerfosis menjadi suatu rasa yang lebih dalam. Yaitu Cinta.\n" +
                "Rumah tangga yang awalnya terasa biasa saja, mulai terlihat sisinya. Perasaan membuat itu semua menjadi indah, dan Meta tidak akan pernah menyesal karena telah menjadi istri dari seorang Jefan Nadhitama. Dan ia tidak akan pernah menyesal terjebak dalam sebuah ikatan yang bernama pernikahan bersama Jeje selama hidupnya. Karena ia telah menemukan kebahagiaan disisi Jeje. Kebahagian yang tak akan pernah bisa di beli dan di tukar dengan apapun di dunia ini. \n" +
                "Angin tau, langit pun tau, dan semesta juga tau, kalau tidak ada yang bisa menandingi perasaan yang bernama Cinta! Yang Jeje dan Meta punya. \n" +
                "Cuppp. Meta tersentak ketika suatu benda yang lembut dan hangat menyentuh dahi nya. Ia melihat Jeje tengah tersenyum kearahnya. Dengan wajah paling tampan sejagat raya, menurut Meta sih! Karena wajah bangun tidur Jeje adalah salah satu karunia Tuhan yang lainnya yang sangat Meta kagumi. \n" +
                "“Morning Love” tangan Jeje membelai pipi Meta lembut, lalu merengkuh Meta dan membawa nya ke dalam pelukan hangat Jeje. \n" +
                "“Morning too, Sayang” balasnya. Lalu ia meringkuk ke dalam dada bidang suaminya, mencari kehangatan dan kenyamanan di dalam pelukan penuh cinta Jeje. Mendengarkan detak jantung Jeje yang bagaikan nyanyian pengantar tidur, tapi yang membuat Meta sangat bahagia adalah ritme detak jantung Jeje yang seirama dengan miliknya. \n" +
                "Meta tersenyum bahagia dalam pelukan hangat Jeje, mengucap banyak syukur pada sang Pencipta. Yang telah menyatukan ia dengan Pangeran Tampan yang sedang mendekapnya. “I love you” ucap suara Jeje lirih. \n" +
                "“Love you more” balas Meta sambil memeluk Jeje dengan erat.\n");

        judulNovel.add("Aluna");
        genreNovel.add("Adventure");
        coverNovel.add("https://a.wattpad.com/cover/68173335-176-k892327.jpg");
        karyaNovel.add("MiftaHeartfillia");
        infoNovel.add("Teringat di suatu subuh yang kelabu di hari Selasa. Saat itu hujan gerimis menemani setiap detik para calon penumpang bus di sebuah halte kecil. Untuk melindungi dari hujan gerimis subuh itu, orang-orang membuka payung yang dibawanya, atau hanya mengandalkan mantel yang dipakainya, ada pula yang ikut merapat bersama para calon penumpang bus di bawah naungan halte.\n" +
                "Di belakang halte tersebut, ada seorang ibu yang menjajakan dagangannya untuk sekadar memberikan kehangatan kepada para calon penumpang bus. Kopi, susu, teh, gorengan, dan aneka minuman dan makanan lainnya siap disajikan dalam keadaan masih hangat. Para kenek angkutan antarkota berteriak-teriak menawarkan tujuannya kepada para penghuni halte menambah keramaian subuh kala itu.\n" +
                "Ketika bus tiba, aku pun bersama dengan para calon penumpang cepat-cepat merapat ke depan pintu bus yang telah dibuka. Ada yang berharap masih ada kursi kosong yang tersisa untuk diduduki. Ada juga yang sudah tahu bahwa bus di waktu subuh pastilah penuh, jangan harap dapat kursi untuk diduduki sambil menuntaskan rasa kantuk yang melanda sisa malam tadi, karena halte ini adalah halte pemberhentian ketiga rute bus ini.\n" +
                "Desing suara pintu bus ditutup pun terdengar. Tak ada penumpang lain lagi yang akan masuk. Bus pun berjalan dengan kecepatan biasa meninggalkan keramaian di halte ketiga. Aku pun melihat-lihat seluruh kursi, tetapi tak kudapati satu pun yang kosong. Aku pun meraih pegangan yang menggantung di bagian atas bus ini. Mencoba menjaga keseimbangan.\n" +
                "Kuperhatikan langit di luar. Semburat cahaya matahari mulai memperjelas pemandangan di sisi-sisi jalan. Orang-orang mulai membuka tokonya. Buruh-buruh mulai berdatangan menuju pabrik. Para pekerja berjalan cepat-cepat ke arah kantornya. Anak-anak sekolah diantar para orangtua.\n" +
                "Temanku bilang, semua orang dengan aktivitas yang berbeda itu sedang menuju tujuan yang sama. Dia mencoba bermain tebak-tebakan denganku kala itu.\n" +
                "“Coba jawab, Na!” ujarnya setelah melontarkan pertanyaannya.\n" +
                "“Apa ya?” tanggapku sambil berpikir.\n" +
                "“Bahagia?” jawabku ragu. Ia hanya tersenyum menatapku.\n" +
                "Desing suara pintu bus yang terbuka kembali terdengar. Seorang ibu membawa bayi kecil di gendongannya pun masuk mendahului seorang pemuda berkemeja biru langit lengan panjang yang ia lipat sesiku. Halte keempat ini hanya menaikkan dua penumpang. Ibu tersebut mendapatkan kursi setelah seorang lelaki dewasa dengan tas kerjanya memberikan tempat duduknya.\n" +
                "“Makasih.” Ucap ibu itu dengan senyum sopan. Kemudian ia duduk dan memberikan sebotol susu formula untuk anaknya yang terbangun hampir menangis karena kedinginan memasuki bus AC di pagi hari yang dingin.\n" +
                "Untuk mencapai halte terakhir, rute bus ini melewati jalan yang terlintas di tengahnya rel kereta api sehingga terkadang pada jam-jam sibuk seperti ini kemacetan tak dapat dihindari. Bila kereta api lewat, palang pintu kereta api akan diturunkan secara otomatis. Palang pintu kereta api yang diturunkan ini lah yang membuat hentinya jalur lalu lintas sementara untuk mendahulukan kereta api yang lewat.\n" +
                "Sekejap angin berembus kasar di luar bus, menambah hawa dingin pagi itu. Suara khas gemuruh kereta datang pun terdengar selama beberapa menit kemudian hilang. Kulihat palang pintu kereta api otomatis itu telah dinaikkan kembali. Lalu lintas pun berjalan kembali. Satu per satu kendaraan maju melewati rel kereta api. Tepat ketika bus melewati rel kereta api sebelah kanan, seseorang menepuk pundak sebelah kiriku. Kutolehkan kepalaku kearahnya.\n" +
                "“Duduk, Mbak,” seorang ibu mempersilakanku menempati kursinya.\n" +
                "“Saya mau turun di depan,” lanjutnya.\n" +
                "“Oh. Terima kasih Bu,” jawabku sembari tersenyum.\n" +
                "Ketika aku hendak melangkahkan kaki menuju kursi itu, kulihat seorang petugas kereta api keluar terburu-buru seperti meneriakkan sesuatu sambil melambai-lambaikan tangan dari pos jaganya. Saat itulah, semua tak dapat dikondisikan lagi. Bus tiba-tiba berhenti, terjebak di tengah-tengah rel kereta api, sang sopir mengumpat marah. Semua penumpang panik bertanya-tanya apa yang terjadi. Bayi yang tertidur lelap terbangun mendengar kegaduhan. Tubuhku pun mematung, terlihat dari kejauhan kereta api berjalan ke arah bus yang kutumpangi dengan kecepatan penuh sulit untuk diberhentikan.\n" +
                "“Buka pintunya!!!!” aku berteriak sekencang mungkin, sambil berusaha menggerakkan kakiku yang gemetaran. Semua orang pun terdiam menatapku nanar. Aku pun mengarahkan jari telunjukku ke luar jendela untuk memberi mereka penjelasan.\n" +
                "“Cepat buka pintunya, Pak Sopir!!!” teriakku sekali lagi. Suasana di dalam bus pun berubah menjadi kacau. Semua orang berteriak menginterupsi konsentrasi sang supir bus. Supir bus itu masih berusaha menjalankan busnya dengan panik.\n" +
                "“Tak akan ada gunanya, bodoh!” Seorang bapak-bapak menghardiknya tak sabaran.\n" +
                "“Cepat buka saja pintunya!” Kali ini seorang wanita paruh baya meneriakinya dengan suara parau.\n" +
                "“Hanya dengan ini kita akan selamat semuanya!” balas sang supir keras kepala.\n" +
                "“Sungguh kau tidak tahu?!! Kalau sudah seperti ini, sekuat apapun kau menginjak pedal gasnya bus ini tetap tidak akan berjalan!!!!” ujar seorang pemuda berambut cepak dengan teriakannya.\n" +
                "Sang sopir bus pun menghela napasnya kasar, mengumpat kembali sambil terus menginjak pedal gasnya kuat-kuat. Jalan pikirannya tak dapat dikendalikan, serangan panik membuatnya tak dapat berpikir dengan jernih.\n" +
                "“Yang benar saja??!!!” Seorang perempuan berteriak tak tahu lagi harus melakukan apa setelah melihat sang sopir masih keras kepala melakukan hal yang tak berguna.\n" +
                "Aku pun mengedarkan pandanganku kesekeliling bus, hingga kudapati di sisi bagian belakang bus sebuah benda merah alat pemecah kaca. Dengan terburu-buru aku berjalan untuk mengambilnya. Dengan susah payah aku melepaskan benda itu dari tempatnya hingga akhirnya dapat ter-lepas. Cepat-cepat kupukulkan benda itu pada pintu kaca bus yang berada di bagian tengah bus sebelah kanan.\n" +
                "Prangg!! Terdengar suara kaca pecah yang membuat perhatian semua orang ter-arah padaku. Kemudian seorang pemuda berkemeja lengan panjang yang tadi naik di halte keempat membantuku dengan menendangkan kakinya ke arah kaca yang sudah mulai retak.\n" +
                "Mulailah kaca-kaca tersebut berjatuhan hingga kiranya dapat mengeluarkan satu per satu orang dari bus itu.\n" +
                "“Saya akan mengeluarkan para wanita dan anak-anak terlebih dahulu. Kamu bantu saya memecahkan kaca di sebelah sana,” ucapku pada pemuda itu sambil menunjuk pintu kaca yang sebelah kiri. Lelaki itu pun menganggukkan kepalanya.\n" +
                "“Pak sopir tolong cepat bukakan pintunya. Kereta api itu semakin mendekat akan menabrak kita,” seorang anak laki-laki berkata dengan air mata yang berderai-derai sembari memegangi tangan ibunya kuat-kuat. Orang-orang di luar sudah meneriaki mereka tak sabaran, panik jika harus terjadi sesuatu yang tak diharapkan siapa pun. “Tombol pembuka otomatisnya pun tak dapat berjalan,” ujar sang sopir dengan kepala menunduk pasrah.\n" +
                "Para penumpang pun menghembuskan napas paniknya. Berteriak-teriak tak jelas. Kemudian mendekat ke arahku, berebut hendak cepat-cepat keluar.\n" +
                "“Ayo, Bu. Ibu duluan,” ujarku pada ibu dengan bayi yang menangis di pelukannya.\n" +
                "Tiba-tiba seorang bapak-bapak menyerobot tubuhku berusaha untuk keluar lewat kaca yang aku dan pemuda itu pecahkan.\n" +
                "“Pak!!” sentakku sembari menariknya sekuat tenaga untuk menyingkir\n" +
                "“Tolong kerja samanya! Ini bukan waktunya untuk mendahulukan ego kita! Kau mau semuanya kacau hanya karena kau terjebak dalam emosimu?!!” seruku kesal. Namun, bapak itu tak mau mendengar, hingga pemuda yang membantuku tadi menariknya dengan sekuat tenaga dan menahannya.\n" +
                "“Lepaskan!!” Bapak itu mencoba melepaskan diri.\n" +
                "“Ayo, Bu. Cepat!” seruku terburu-buru.\n" +
                "Tepat ketika ibu dan anak bayinya itu melompat keluar, kereta itu mendekat. Hanya tinggal berjarak satu meter dari bus. Decitan roda kereta api dengan relnya berdesing tak tertahankan hingga mengeluarkan percikan-percikan api.\n" +
                "\n" +
                "Namun, apa mau dikata, kita tak kuasa melawan waktu yang terus berjalan. Semua berubah menjadi gelap seketika. Usaha sekeras apapun tak dapat merubah takdir agung yang telah ditetapkan-Nya. “Kok senyum?” tanyaku padanya.\n" +
                "“Benar tidak jawabannya?” tanyaku kembali. Tatapannya beralih ke arah depan, seperti membayangkan sesuatu.\n" +
                "“Bagaimana Aluna? Sudahkah kau bahagia?” tanyanya kembali.\n" +
                "“Kurasa, ya,” jawabku menatapnya yakin.\n" +
                "Suatu kesunyian pun menyergap suasana pagi itu. Seakan waktu berhenti, menyisakan asap pekat menutupi pandangan. ***\n");

        judulNovel.add("Surtoksi");
        genreNovel.add("Fiksi Ilmiah");
        coverNovel.add("https://cdn.pixabay.com/photo/2016/03/19/17/15/forest-1267033__340.jpg");
        karyaNovel.add("Haifatuzahro");
        infoNovel.add("Sudah sepuluh tahun kami tidak melihat matahari. Yang menjadi masalah bukanlah mataharinya. Tidak ada larangan bagi kami berada di luar melihat matahari. Tapi kami tidak akan melakukan hal bodoh itu. Jika sampai itu terjadi, berarti kami tidak sayang pada tubuh kami. Lebih parah lagi, itu dinamakan bunuh diri.\n" +
                "Entah sejak kapan pohon di sekitar kota ini mengeluarkan gas yang membuat iritasi pada kulit hingga menyerang pembuluh darah. Gas itu semakin cepat bereaksi dengan kulit oleh bantuan sinar matahari. Tidak semua pohon, hanya satu jenis pohon yang mengeluarkan gas itu. Pohon Surtoksi. Memang benar hanya satu jenis pohon saja, tapi jumlahnya ratusan bahkan ribuan dalam kota ini. Berakar kuat menjulang tinggi tumbuh di seluruh kota hingga sudut-sudutnya. Mengisolir tempat ini ribuan hingga ratusan kilometer.\n" +
                "Kebanyakan orang yang berusaha melarikan diri saat matahari terbenam tidak akan sampai pada batas lingkaran mematikan ini sebelum matahari terbit kembali. Percuma. Mustahil. Itu yang dikatakan banyak orang. Tidak ada yang dapat menolong. Sinyal elekromagnetik sebagai penolong satu-satunya pun terhambat oleh gas-gas beracun yang dikeluarkan pohon-pohon itu.\n" +
                "\n" +
                "***\n" +
                "\n" +
                "Senin, 1 Agustus 2045 Pukul 18.50\n" +
                "\n" +
                "“Yeksaaa! Kau tidak berangkat sekolah?” panggil Ibu sembari mengetuk pintu kamarku.\n" +
                "\n" +
                "Aku masih fokus membaca buku yang baru saja kudapatkan dari Prof. Nemba. Beliau bersedia mengikutkan aku pada proyeknya apabila aku dapat menyelesaikan membaca buku ini dan lulus uji review subuh ini juga.\n" +
                "“Yeksa!” panggil Ibu dengan suara yang semakin keras.\n" +
                "Baiklah, sekarang fokusku benar-benar terusik oleh suara Ibu. Aku menutup buku dan menggendong ransel. Sebelum teriakan Ibu menjebol pintu, aku harus sudah keluar dari kamar ini.\n" +
                "“Mantelmu?” tanya Ibu mengingatkan sebelum aku keluar dari rumah.\n" +
                "“Aku bukan anak kecil lagi Ibu. Lima tahun lebih aku memakai mantel itu untuk berpergian ke luar rumah, tidak mungkin aku lupa memakainya.”\n" +
                "Mantel gas Surtoksi adalah pakaian wajib orang-orang di kota ini saat berada di luar rumah pada malam hari. Mantol ciptaan Prof. Nemba itu menahan gas Surtoksi menempel pada kulit kami. Meski dapat menyelamatkan kehidupan kami saat malam hari, mantel itu belum bisa menahan keganasan gas Surtoksi pada siang hari. Di bagian kepala mantel dilengkapi penutup wajah transparan. Mantel gas Surtoksi berwarna putih itu akan otomatis berubah warna menjadi hijau apabila lingkungan sekitarnya sudah sangat jenuh gas Surtoksi. Tanda bahaya itu wajib diperhatikan agar pemakai segera mencari tempat berlindung apa saja yang kedap gas Surtoksi.\n" +
                "Setiap rumah di kota ini juga dilengkapi cat dinding anti gas Surtoksi ciptaan Prof. Nemba. Sejak 5 tahun yang lalu, tak ada jendela di setiap rumah.\n" +
                "Banyak alat-alat yang diciptakan Prof. Nemba bersama tim penelitiannya dalam membantu kehidupan kota ini sehari-hari. Membantu kami untuk tetap hidup di antara pohon-pohon mematikan itu. Itulah sebabnya aku ingin menjadi salah satu anggota tim penelitian Prof. Nemba. Sebuah kebanggaan setiap keluarga apabila anaknya menjadi anggota tim penelitian Prof. Nemba.\n" +
                "\n" +
                "***\n" +
                "\n" +
                "“Sudah kuduga kau akan berada di tempat ini lagi.” Ucap Lakso yang membuat perhatianku kepada buku yang sedang kubaca teralihkan.\n" +
                "“…Tiga hari kau bolos sekolah demi lulus uji review buku The Monocotyle Trees yang sama sekali tidak dapat mengungkap rahasia pohon Surtoksi.”\n" +
                "“Kau merendahkan Prof. Nemba?” tanyaku sedikit tersinggung.\n" +
                "“Jika beliau benar-benar ingin membuat kehidupan kota ini aman dan nyaman, seharusnya beliau memikirkan bagaimana caranya memusnahkan pohon sialan itu.”\n" +
                "“Kau banyak sekali bicara. Takl more do less! Orang lain tidak akan ada yang percaya jika kau itu cucu kandung Prof. Nemba.” hujatku membungkam mulut Lakso. Dia diam tak membalas perkataanku lagi.\n" +
                "“Jangan sedih jika kau tidak lulus.” Ucapnya sembari menghilang di antara tumpukan buku-buku perpustakan ini.\n" +
                "\n" +
                "***\n" +
                "\n" +
                "Review buku diuji oleh 3 orang termasuk Prof. Nemba. Ini adalah test tahap akhir seleksi anggota tim penelitian yang sudah dilakukan sejak bulan lalu. Aku hanya butuh satu dari sepuluh kursi yang tersedia. Aku yakin telah memahami semua isi dalam buku itu.\n" +
                "Tiga penguji masing-masing memberikan satu pertanyaan. Aku menjawab semua pertanyaannya dengan lancar. Aku yakin aku pasti akan lolos.\n" +
                "Satu jam kemudian kertas pengumuman anggota tim penelitian pun ditempel dan langsung di kelilingi oleh banyak orang. Aku berjalan menuju kertas pengumuman itu dengan santai. Yeksa Citra Viona. Aku mencari namaku di antara list 10 orang dalam kertas itu.\n" +
                "Nihil. “Apa?! Mengapa bisa tidak ada namaku?!” Kesalku setengah mati. Semua orang melihatku dengan pandangan tidak suka. Aku tidak peduli dan segera berlari menuju ruang Prof. Nemba. Sebelum sampai di depan ruangannya, beliau muncul dari balik pintu. Aku berjalan ke arahnya. Wajahku penuh dengan pertanyaan. Beliau tiba-tiba mengulurkan tangan kanannya. Aku menjabat tangannya sembari tetap memasang wajah penuh pertanyaan dan menahan kesedihan.\n" +
                "“Tetap berjuang Yeksa! Kau masih muda, banyak hal yang bisa kau lakukan di luar sana. Tetap belajar dengan giat.” Ucap Prof. Nemba sembari menepuk-nepuk punggungku. Aku terdiam tak mengeluarkan sepatah kata pun. Beliau berlalu dan air mataku pun menetes.\n" +
                "\n" +
                "***\n" +
                "\n" +
                "“Kan sudah kubilang untuk tidak menangis.” Ucap Lakso yang keberadaannya baru saja kusadari.\n" +
                "“…Perpustakaan ini pun tahu kau gadis yang cerdas. Semua itu bukan karena kau tidak pantas untuk lolos ujian review.”\n" +
                "“Apa maksudmu? Kau sudah tahu kalau aku tidak akan lolos? Atau jangan-jangan kau yang membuatku tidak lolos. Kau menjelek-jelekan aku di depan Prof. Nemba?”\n" +
                "“Ngaco banget sih omonganmu.”\n" +
                "“Lalu apa?!” sahutku marah.\n" +
                "“Kau tidak diikutkan karena alasan politis.” Pungkas Lakso yang membuat wajah merahku berubah menjadi wajah penasaran.\n" +
                "“…Aku sudah tahu sejak awal. Aku akan menjelaskan semuanya dengan syarat kau tidak akan membocorkan pertkataanku pada siapa pun.”\n" +
                "Aku mengangguk yakin dan sangat menunggu kata-kata Lakso selanjutnya.\n" +
                "“Tim penelitian akan membuat alat untuk mengirim pesan pertolongan ke ibu kota. Alat dengan penangkap sinyal elektromagnetik terkuat yang pernah ada. Tentu saja itu sangat berbahaya bagi kesehatan makhluk hidup tingkat tinggi dan mematikan makhluk hidup tingkat rendah. Ayahmu sebagai seorang dokter dan ikatan dokter di kota ini sangat menolak penelitian itu. Itulah sebabnya kau menjadi daftar hitam untuk dapat diterima sebagai anggota tim penelitian Prof. Nemba.”\n" +
                "“Hah? Jika penelitian itu berbahaya, lalu mengapa tetap akan dijalankan?”\n" +
                "“Kau seperti tidak tahu penduduk sini saja. Tentu saja karena mereka sudah sangat ingin keluar dari lingkaran mematikan ini dan hidup dengan normal.”\n" +
                "“Percuma hidup dengan normal jika kita nantinya terkena penyakit.”\n" +
                "“Tuh kan, kau juga tidak setuju dengan penelitiannya. Karena itu penelitian ini masih bersifat rahasia.”\n" +
                "“Kita tidak boleh diam saja.” Ucapku dengan yakin.\n" +
                "“Tentu. Aku juga sedang melakukan penelitian bersama klub biologi. Karena itu, sebelum hal tersebut terjadi, ayo kita buat pohon-pohon Surtoksi mengehentikan gas beracunnya.”\n");

        judulNovel.add("Zombie and Plant");
        genreNovel.add("Komedi");
        coverNovel.add("https://www.gamewallpapers.com/img_script/mobile_dir/img.php?src=wallpaper_plants_vs_zombies_garden_warfare_01.jpg&width=450&height=800&crop-to-fit");
        karyaNovel.add("Ari Sofiyani");
        infoNovel.add("Pukul 20.00 WIB. Penyelidikan di rumah tersangka pencurian…\n" +
                "“Ah!!! Itu pencurinya!!! Tangkaaappp!!!”\n" +
                "Teriakan ala suku mongol ini berasal dari seorang kawanku yang bernama Meranti. Perlu penjelasan lebih lanjut bahwa kami kini sedang berada di koordinat S (4,5) yang merupakan letak dari rumah musuh bebuyutan Ranti, laki-laki penggemar game Zombie vs Plants? Dae. Jarak rumah Dae dan Ranti sebetulnya hanya dipisahkan oleh rumahku. Setiap mereka bertengkar, aku yang selalu jadi mikrofonnya, jadi kurir pengantar pesan berisi makian-makian yang menyebalkan. Intinya, aku adalah korban dari perang mereka berdua. Huh, sialnya…\n" +
                "Kawan, mengapa aku bisa terjebak di rumah Dae bersama perintah-perintah penggempuran area perang ini? Yah, sebabnya adalah karena pagi tadi, black forest yang dibeli dengan tumpahan air liur Ranti, hilang lenyap secara tiba-tiba seperti ditelan bumi! Tim intel kami menelusuri kejadian perkara dan sampailah pada tersangka utama yaitu Dae, si pemamah biak.\n" +
                "“Hancurkan pasokan pangan!!!” perintahnya. Lagi-lagi aku harus terlibat hal-hal konyol dengan mereka. Dae mengamankan daerah persediaan makanan (baca: kulkas). Kucingnya yang berwarna oranye membuntuti dari belakang.\n" +
                "“Nnnnggg… aku nggak nyuri black forestmu. Si Mera ini yang minta.” Dae menunjuk kucingnya yang mengeong-ngeong gembira. “Ya, kan Mera?” Kucing betina oranye ini bernama Meranti. Ini juga ide dari si Dae untuk mencari gara-gara dengan Ranti asli.\n" +
                "“Hah!! Nggak ada gencatan senjata!! Serahkan seluruh pasokan makananmu!!”\n" +
                "Dae tiba-tiba memakai kostum Zombie. “Nggak bisa!! Now, Zombie eats your brain…”\n" +
                "Yeah, kalian pasti penasaran makhluk seperti apa Dae ini. Dia itu maniak Zombie. Kamarnya penuh dengan poster Zombie vs. Plant, dia mengoleksi kostum zombie (padahal cuma baju compang-camping), di bagian belakang kamarnya terpajang gambar nisan tiga dimensi dari sterofoam, dan masih banyak hal-hal tak terduga dari makhluk titisan zombie ini.\n" +
                "“Kekuatan duri bunga mawar dan sulur-sulur tumbuhan liar!! Hancurkan zombie!!”\n" +
                "Hhhh… setelah ini, gempa pasti mengguncang seisi rumah dengan skala 5 richter. Aku harus mengevakuasi diri dari radius 5 km. Kalau Ranti memulai perang, imajinasinya terbang kemana-mana. Segala konsep alam di keluarkannya. Meranti ini adalah seorang pecinta alam dan aku adalah anak dari seorang pemilik toko bunga. Kami sering menanam bunga bersama-sama, dan si zombie ini sering mengacaukan mood kami.\n" +
                "“Aku buat senjata dari tulang zombie!! Huahahaha!!”\n" +
                "“Getah karet perangkap!!”\n" +
                "“Jurus bau badan zombie!! Apa kau bisa menghindari ini haaahh?”\n" +
                "“Perlindungan dari wangi melati…!!”\n" +
                "Pertarungan ini berlangsung hingga pukul lima pagi. Di luar dugaan, mereka mulai melempar-lempar kertas, panah-panah api berjatuhan. Parahnya lagi, rumah di sebelah Dae terbakar. Tunggu. Apaaa!!!??? Itu rumahku!!\n" +
                "“Stoooppp!! Kalian membuat bangkrut keluargaku!! Toko bungaku terbakar… tidaaakkk!!! Segera hentikan perang ini dan mulailah kerja bakti!! Tanam kembali semua bunga-bungaku! Bereskan sampah-sampah kalian!! Huh! Dasar!”\n" +
                "Mereka berdua ternganga “Haaah??”\n" +
                "Pukul enam pagi bola-bola kertas sudah terkumpul rapi dan rencananya akan dibuat daur ulang. Pot-pot bunga disiapkan dan mereka dengan rajinnya mengisi berbagai macam bunga dalam pot-pot itu. Tidak ada pertengkaran. Tidak ada perang. Tanpa diplomasi, mereka berdamai dalam ikatan kepedulian dengan alam. Aku bisa melihatnya, selama bertahun-tahun mereka mengekspresikan perasaan melalui kekonyolan yang mereka ciptakan sendiri. Hari ini mereka bahagia dengan menyentuh daun-daun hijau itu. Tertawa bersama dan terlihat gembira.\n" +
                "Mereka menciptakan game mereka sendiri. Bukan Zombie vs. Plant. Tapi, Zombie AND Plant.\n" +
                "\n");

        prosesRecyclerViewAdapter();
    }
}
