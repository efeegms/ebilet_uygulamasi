package ebilet_uygulaması;
// kullanıcı girişi > sefer > sefer saati > koltuk numarası > bilet no belirleme > ödeme kısmı > son durum 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ebilet extends ArrayList { // extends
	// Değişkenler
	private String ilkIsim;
	private String soyIsim;
	private static int sonDortHane;
	private String biletNo;
	private String koltuklar = "";
	
	private double toplamBorc;
	private double koltukUcreti = 600;
	private double koltukUcreti2 = 800;
	
	private static int id = 1000;
	int sayac = 1;
//-----------------------------------------------------------------------------------------------------------------------

	static boolean aktif = true;
	static int hakSayisi = 3;
	
	// Constructor
	public ebilet() {
	super(); 
//-----------------------------------------------------------------------------------------------------------------------
		
		//giriş kısmı
        Scanner scan = new Scanner(System.in);
		if(aktif) {
			if(hakSayisi > 0) {
				while(aktif) {
					
					System.out.print("Kullanıcı Adınız: ");
					String kullanici = scan.nextLine().toLowerCase();
					
					System.out.print("Şifreniz: ");
					String sifre = scan.nextLine();
					
					boolean sonuc = giris(kullanici, sifre);
					if(sonuc) {
						System.out.println("Uygulamaya başarılı olarak giriş yaptınız. \n");
						break;
					} 
					else {
						if (hakSayisi == 0 ) {
							aktif = false;
							System.out.println("Hak sayınız dolmuştur, hesabınız bloke oldu! ");
							System.exit(0); 
						}
					}
					
				}
			} 
		}
			
		
//-----------------------------------------------------------------------------------------------------------------------
		
		System.out.println("--------EBİLET'E HOŞGELDİNİZ--------\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Adınızı giriniz: ");
		this.ilkIsim = input.nextLine();
		
		System.out.print("Soyadınızı giriniz: ");
		this.soyIsim = input.nextLine();
		
	}
	
//-----------------------------------------------------------------------------------------------------------------------	
	
	public static boolean giris(String kullanici, String sifre) {
		if(kullanici.equals("efeegms") && sifre.equals("217451")) {
			return true; //başarılı
		} 
		else {
			hakSayisi--;
			System.out.println("Kullanıcı adı ve şifreniz yanlıştır. ");
			return false;
		}
	}
	
//-----------------------------------------------------------------------------------------------------------------------
	
	//Sefer seçimi
	public void seferSecimi() {
		System.out.println("---------------------------------------------------");
		Scanner input = new Scanner(System.in);
		System.out.println("SEFER LİSTESİ: " + 
			      "\n1-) İstanbul - Ankara" + 
				  "\n2-) İstanbul - İzmir" + 
			      "\n3-) İstanbul - Antalya" + 
				  "\n4-) İstanbul - Bursa" + 
			      "\n5-) İstanbul - Adana");
		System.out.println("---------------------------------------------------");
		while (true) {
				String sefer = input.nextLine();
				switch (sefer) {
				case "1":  
			    	System.out.println("(İstanbul - Ankara) seferini seçtiniz. ");	
			    	break;
			    case "2":
			    	System.out.println("(İstanbul - İzmir) seferini seçtiniz. ");	
			    	break;
			    case "3":
			    	System.out.println("(İstanbul - Antalya) seferini seçtiniz. ");
			    	break;
			    case "4":
			    	System.out.println("(İstanbul - Bursa) seferini seçtiniz. ");
			    	break;
			    case "5":
			    	System.out.println("(İstanbul - Adana) seferini seçtiniz. " );
			    	break;
			    default:
			    	System.out.println("Geçersiz işlem yaptınız, lütfen tekrar deneyiniz. ");
			    	seferSecimi();
			    	break;
		      }
	    break;		
	
		}
		
	}
	
//-----------------------------------------------------------------------------------------------------------------------
	
	//Sefer saati seçimi
	public void seferSaati() {
		System.out.println("---------------------------------------------------");
		Scanner input = new Scanner(System.in);
		System.out.println("\nSEFER SAATLERİ:\n\n" +  "1-) 00.15 ||" +  "  2-) 02.15 ||" + "  3-) 04.30 ||" + "  4-) 06.30" + "\n5-) 08.45 ||" +
				"  6-) 10.30 ||" +"  7-) 12.00 ||" + "  8-) 14.00" + "\n9-) 16.45 ||" + " 10-) 18.15 ||" + " 11-) 20.30 ||" + " 12-) 22.45 ");
		System.out.println("\n---------------------------------------------------");
		while(true) {
			String saat = input.nextLine().toUpperCase();
				switch (saat) {
				case "1":
				    System.out.println("(00.15) sefer saatini seçtiniz.  ");	
				    break;
				case "2":
				    System.out.println("(02.15) sefer saatini seçtiniz.  ");	
				    break;
				case "3":
				    System.out.println("(04.30) sefer saatini seçtiniz.  ");	
				    break;
				case "4":
				    System.out.println("(06.30) sefer saatini seçtiniz.  ");	
				    break;
				case "5":
				    System.out.println("(08.45) sefer saatini seçtiniz.  ");	
				    break;
				case "6":
				    System.out.println("(10.30) sefer saatini seçtiniz.  ");	
				    break;
				case "7":
				    System.out.println("(12.00) sefer saatini seçtiniz.  ");	
				    break;
				case "8":
				    System.out.println("(14.00) sefer saatini seçtiniz.  ");	
				    break;
				case "9":
				    System.out.println("(16.45) sefer saatini seçtiniz.  ");	
				    break;
				case "10":
				    System.out.println("(18.15) sefer saatini seçtiniz.  ");	
				    break;
				case "11":
				    System.out.println("(20.30) sefer saatini seçtiniz.  ");	
				    break;
			    case "12":
				    System.out.println("(22.45) sefer saatini seçtiniz.  ");	
				    break;
				default:
				    System.out.println("Geçersiz işlem yaptınız, lütfen tekrar deneyiniz. ");
				    seferSaati();
				    break;
			}
		break;	
	}			
}
	
//-----------------------------------------------------------------------------------------------------------------------
		
	    // Koltun seçimi
		public void koltukAlımı() {
			boolean ka = true;
			List<String> secilenKoltuklar = new ArrayList<>();
			System.out.println("---------------------------------------------------");
			System.out.println("   Tekli koltuklarda fiyat farkı uygulanmaktadır. ");
			System.out.println("---------------------------------------------------");
			Scanner input = new Scanner(System.in);
			System.out.println("\n\t▬KOLTUK NUMARALARI▬\n " + "\n\t1  ||" + "      2  ||" + "  3  " + "\n\t4  ||" + "      5  ||" + "  6  " + "\n\t7  ||" + "      8  ||" + "  9  " + 
			"\n\t10 ||" + "      11 ||" + " 12 " + "\n\t13 ||" + "      14 ||" + " 15 " + "\n\t16 ||" + "      17 ||" + " 18 " + "\n\t19 ||" + "      20 ||" + " 21 ");
			System.out.println("\n-------------------------------------------------------------");
			do {
				System.out.print("Lütfen satın almak istediğiniz koltuğun numarasını giriniz.\nVeya çıkış için X'e basınız: ");
				String koltuk = input.next().toUpperCase();
				System.out.println("-------------------------------------------------------------");
				//seçilenKoltuklar koltuğu (içermiyorsa(contains)) eklesin.
				if(!secilenKoltuklar.contains(koltuk)) {
					secilenKoltuklar.add(koltuk);
					switch (koltuk) {
					case "1":
				    	  koltuklar = koltuklar + sayac +") 1 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster2();
				    	  sayac++;
				    	  break;
				      case "2":
				    	  koltuklar = koltuklar + sayac +") 2 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster();
				    	  sayac++;
				    	  break;
				      case "3":
				    	  koltuklar = koltuklar + sayac +") 3 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster();
				    	  sayac++;
				    	  break;
				      case "4":
				    	  koltuklar = koltuklar + sayac +") 4 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster2();
				    	  sayac++;
				    	  break;
				      case "5":
				    	  koltuklar = koltuklar + sayac +") 5 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster();
				    	  sayac++;
				    	  break;
				      case "6":
				    	  koltuklar = koltuklar + sayac +") 6 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster();
				    	  sayac++;
				    	  break;
				      case "7":
				    	  koltuklar = koltuklar + sayac +") 7 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster2();
				    	  sayac++;
				    	  break;
				      case "8":
				    	  koltuklar = koltuklar + sayac +") 8 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster();
				    	  sayac++;
				    	  break;
				      case "9":
				    	  koltuklar = koltuklar + sayac +") 9 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \nn" + koltuklar);	
				    	  borcuGoster();
				    	  sayac++;
				    	  break;
				      case "10":
				    	  koltuklar = koltuklar + sayac +") 10 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster2();
				    	  sayac++;
				    	  break;
				      case "11":
				    	  koltuklar = koltuklar + sayac +") 11 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster();
				    	  sayac++;
				    	  break;
				      case "12":
				    	  koltuklar = koltuklar + sayac +") 12 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster();
				    	  sayac++;
				    	  break;
				      case "13":
				    	  koltuklar = koltuklar + sayac +") 13 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster2();
				    	  sayac++;
				    	  break;
				      case "14":
				    	  koltuklar = koltuklar + sayac +") 14 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster();
				    	  sayac++;
				    	  break;
				      case "15":
				    	  koltuklar = koltuklar + sayac +") 15 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster();
				    	  sayac++;
				    	  break;
				      case "16":
				    	  koltuklar = koltuklar + sayac +") 16 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster2();
				    	  sayac++;
				    	  break;
				      case "17":
				    	  koltuklar = koltuklar + sayac +") 17 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster();
				    	  sayac++;
				    	  break;
				      case "18":
				    	  koltuklar = koltuklar + sayac +") 18 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster();
				    	  sayac++;
				    	  break;
				      case "19":
				    	  koltuklar = koltuklar + sayac +") 19 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster2();
				    	  sayac++;
				    	  break;
				      case "20":
				    	  koltuklar = koltuklar + sayac +") 20 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster();
				    	  sayac++;
				    	  break;
				      case "21":
				    	  koltuklar = koltuklar + sayac +") 21 numaralı koltuk \n";
				    	  System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);	
				    	  borcuGoster();
				    	  sayac++;
				    	  break;
				      case "X":
				    	  ka = false;
				    	  break;
				      default:
				    	  System.out.println("Geçersiz işlem yaptınız. ");
					}
				}
				else {
					System.out.println("Bu koltuk numarasını zaten seçtiniz. Lütfen başka bir koltuk numarası seçiniz. ");
				}
			}
			while(ka);
			System.out.println("Seçilen Koltuklar: \n\n" + koltuklar);
			System.out.println("Toplam borcunuz: "+ toplamBorc + " TL");
			System.out.println("-------------------------------------------------------------");
		}
		
//-----------------------------------------------------------------------------------------------------------------------	
		
		
	// Toplam borcu görüntüle
	public void borcuGoster() {
		toplamBorc = toplamBorc + koltukUcreti;
		System.out.println("Toplam Borcunuz: " + toplamBorc + " TL");
		System.out.println("-------------------------------------------------------------");
	}
	public void borcuGoster2() {
    	toplamBorc = toplamBorc + koltukUcreti2;
		System.out.println("Toplam Borcunuz: " + toplamBorc + " TL");
		System.out.println("-------------------------------------------------------------");
    }
	
	// bilet fiyatı hesaplama
	public void odemeMiktari() {
		Scanner input = new Scanner(System.in);
		System.out.print("Ödeyeceğiniz miktarı giriniz: ");
		double odeme = input.nextDouble();
		if(odeme <= toplamBorc && odeme>=0) {
			toplamBorc = toplamBorc - odeme;
			System.out.println("Ödeme yaptığınız tutar: " + odeme + " TL'dir.");
			System.out.println("Kalan borcunuz: "+ toplamBorc + " TL");
		}
		else {
			System.out.println("-------------------------------------------------------------");
			System.out.println("Hatalı tutar girdiniz.\nMevcut borcunuz: "+ toplamBorc + " TL" );
			System.out.println("-------------------------------------------------------------");
			odemeMiktari();
		}
			
	}

//-----------------------------------------------------------------------------------------------------------------------
	
	// Bilet no belirle
	public void biletNoBelirle() {
		Scanner input = new Scanner(System.in);
		System.out.print("TC'nizin son 4 hanesini giriniz: ");
		int tc = input.nextInt();
		while (tc>=9999 || tc<999) {
			System.out.print("Geçersiz sayı girdiniz.\nLütfen TC'nizin son 4 hanesini giriniz. ");
			tc = input.nextInt();
		}
		this.sonDortHane = tc;
		setsonDortHane();	
		id++;
		this.biletNo = id +""+ sonDortHane;
		System.out.println("Bilet Numaranız: " + biletNo + "\n");
			
	}

	public static void setsonDortHane() {
		if(sonDortHane >= 9999 || sonDortHane <999 ) {
			System.out.print("setGeçersiz sayı girdiniz.\nLütfen TC'nizin son 4 hanesini giriniz. ");
		}
		else {
			System.out.print("Geçerli TC kimlik numarası\n");
		}
	}
	
	public int getsonDortHane() {
		return sonDortHane;
	}
	
	
//-----------------------------------------------------------------------------------------------------------------------		
		
	@Override
	public String toString() { // ?
		System.out.println("-------------------------------------------------------------");
		return "\nİsim Soyisim: " + ilkIsim + " " + soyIsim +"\n"+
	           "Bilet Numaranız: " + biletNo + "\n"+
	           "\nS̲a̲t̲ı̲n̲ a̲l̲ı̲n̲a̲n̲ ̲k̲o̲l̲t̲u̲k̲l̲a̲r̲:\n" + koltuklar + "\n" + 
	           "Kalan borç: " + toplamBorc + " TL\n" + 
	           "-------------------------------------------------------------\n";
	}

}
