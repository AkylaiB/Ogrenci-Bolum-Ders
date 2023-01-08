package VizeOdevi;

import java.util.Scanner;

public class AnaSayfa {

	public static void listele(Bolum[] blmler) {
		for (int i = 0; i < blmler.length; i++) {
			System.out.println("\nBolum No: " + blmler[i].getBolNo() + " Bolum Ad: " + blmler[i].getBolAd());
			System.out.println("Ogrenciler:");
			for (int j = 0; j < blmler[i].ogrenciler.length; j++) {
				System.out.println("\t" + (j + 1) + ".Ogrenci: " + blmler[i].ogrenciler[j].getOgrID() + " "
						+ blmler[i].ogrenciler[j].getOgrAd() + " " + blmler[i].ogrenciler[j].getOgrSoyad() + " "
						+ blmler[i].ogrenciler[j].getOgrSinif());
			}
			System.out.println("Dersler:");
			for (int k = 0; k < blmler[i].dersler.length; k++) {
				System.out.println("\t" + (k + 1) + ".Ders: " + blmler[i].dersler[k].getDersID() + " "
						+ blmler[i].dersler[k].getDersAd() + " " + blmler[i].dersler[k].getDersKredi());
			}
		}
	}

	public static void BolumAdAra(Bolum bler[], String ad) {
		int ctrl = 0;
		for (int i = 0; i < bler.length; i++) {
			if (bler[i].getBolAd().equals(ad)) {
				ctrl = 1;
				System.out.println("\n--------------------------------------------------------------");
				System.out.println("\nBolum No: " + bler[i].getBolNo() + " Bolum Ad: " + bler[i].getBolAd());
				System.out.println("Ogrenciler:");
				for (int j = 0; j < bler[i].ogrenciler.length; j++) {
					System.out.println("\t" + (j + 1) + ".Ogrenci: " + bler[i].ogrenciler[j].getOgrID() + " "
							+ bler[i].ogrenciler[j].getOgrAd() + " " + bler[i].ogrenciler[j].getOgrSoyad() + " "
							+ bler[i].ogrenciler[j].getOgrSinif());
				}
				System.out.println("Dersler:");
				for (int k = 0; k < bler[i].dersler.length; k++) {
					System.out.println("\t" + (k + 1) + ".Ders: " + bler[i].dersler[k].getDersID() + " "
							+ bler[i].dersler[k].getDersAd() + " " + bler[i].dersler[k].getDersKredi());
				}
				System.out.println("\n--------------------------------------------------------------");
			}
		}
		if (ctrl == 0)
			System.out.println("\nBolum bulunamadi!");
	}

	public static void OgrAdAra(Bolum bler[], String Ad) {
		int ctrl = 0;
		for (int i = 0; i < bler.length; i++) {
			for (int j = 0; j < bler[i].ogrenciler.length; j++) {
				if (bler[i].ogrenciler[j].getOgrAd().equals(Ad)) {
					ctrl = 1;
					System.out.println("\n--------------------------------------------------------------");
					System.out.println("\nBolumu:" + bler[i].getBolAd() + " ID:" + bler[i].ogrenciler[j].getOgrID()
							+ " Adi:" + bler[i].ogrenciler[j].getOgrAd() + " Soyadi:"
							+ bler[i].ogrenciler[j].getOgrSoyad() + " Sinifi:" + bler[i].ogrenciler[j].getOgrSinif());
					System.out.println("\n--------------------------------------------------------------");
				}
			}
		}
		if (ctrl == 0)
			System.out.println("\nOgrenci bulunamadi!");
	}

	public static void DersAdAra(Bolum bler[], String Ad) {
		int ctrl = 0;
		for (int i = 0; i < bler.length; i++) {
			for (int j = 0; j < bler[i].dersler.length; j++) {
				if (bler[i].dersler[j].getDersAd().equals(Ad)) {
					ctrl = 1;
					System.out.println("\n--------------------------------------------------------------");
					System.out.println("\nBolum:" + bler[i].getBolAd() + " ID:" + bler[i].dersler[j].getDersID()
							+ " Ad:" + bler[i].dersler[j].getDersAd() + " Kredi:" + bler[i].dersler[j].getDersKredi());
					System.out.println("\n--------------------------------------------------------------");
				}
			}
		}
		if (ctrl == 0)
			System.out.println("\nDers bulunamadi!");
	}

	public static void SnfAra(Bolum bler[], int Snf) {
		int ctrl = 0;
		for (int i = 0; i < bler.length; i++) {
			for (int j = 0; j < bler[i].ogrenciler.length; j++) {
				if (bler[i].ogrenciler[j].getOgrSinif() == Snf) {
					ctrl = 1;
					System.out.println("\n--------------------------------------------------------------");
					System.out.println("\nBolumu:" + bler[i].getBolAd() + " ID:" + bler[i].ogrenciler[j].getOgrID()
							+ " Adi:" + bler[i].ogrenciler[j].getOgrAd() + " Soyadi:"
							+ bler[i].ogrenciler[j].getOgrSoyad() + " Sinifi:" + bler[i].ogrenciler[j].getOgrSinif());
					System.out.println("\n--------------------------------------------------------------");
				}
			}
		}
		if (ctrl == 0)
			System.out.println("\nSinif bulunamadi!");
	}

	public static void KrediAra(Bolum bler[], int kredi) {
		int ctrl = 0;
		for (int i = 0; i < bler.length; i++) {
			for (int j = 0; j < bler[i].dersler.length; j++) {
				if (bler[i].dersler[j].getDersKredi() == kredi) {
					ctrl = 1;
					System.out.println("\n--------------------------------------------------------------");
					System.out.println("\nBolum:" + bler[i].getBolAd() + " ID:" + bler[i].dersler[j].getDersID()
							+ " Ad:" + bler[i].dersler[j].getDersAd() + " Kredi:" + bler[i].dersler[j].getDersKredi());
					System.out.println("\n--------------------------------------------------------------");
				}
			}
		}
		if (ctrl == 0)
			System.out.println("\nBu krediye sahip ders bulunamadi!");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in, "ISO-8859-9"); // turkce karakter okunabilinmesi icin
		int bs, os, ds; // bolumsayisi, ogrencisayisi,derssayisi
		System.out.print("Kac tane bolumunuz olacak? Bolum sayisi:");
		bs = scan.nextInt();
		Bolum[] bolumler = new Bolum[bs];
		int bNo, oSnf, dKredi;
		String bAd, oAd, oSoyad, dAd;
		for (int i = 0; i < bs; i++) {
			System.out.print(i + 1 + ".Bolumun numarasi:");
			bNo = scan.nextInt();
			System.out.print(i + 1 + ".Bolumun adi:");
			bAd = scan.next();

			System.out.print("Bu bolumde okuyacak ogrenci sayisini giriniz:");
			os = scan.nextInt();
			Ogrenci[] ogrler = new Ogrenci[os];
			for (int j = 0; j < os; j++) {
				System.out.print(j + 1 + ".Ogrencinin adi:");
				oAd = scan.next();
				System.out.print(j + 1 + ".Ogrencini soyadi:");
				oSoyad = scan.next();
				System.out.print(j + 1 + ".Ogrencini sinifi:");
				oSnf = scan.nextInt();
				Ogrenci ogr = new Ogrenci(bNo, oSnf, oAd, oSoyad);
				ogrler[j] = ogr;
			}

			System.out.print("Bu bolumdeki ders sayisini giriniz:");
			ds = scan.nextInt();
			Ders[] dersler = new Ders[ds];
			for (int k = 0; k < ds; k++) {
				System.out.print(k + 1 + ".Dersin adi:");
				dAd = scan.next();
				System.out.print(k + 1 + ".Dersin kredisi:");
				dKredi = scan.nextInt();
				Ders ders = new Ders(bNo, dKredi, dAd);
				dersler[k] = ders;
			}
			Bolum bolum = new Bolum(bNo, bAd, ogrler, dersler);
			bolumler[i] = bolum;
		}

		int ctrl = 0, secim;
		while (ctrl != 1) {
			System.out.print("\n 1- Tum Bolumlerin Bilgilerini Listele\n" + " 2- Bolum Adına Gore Arama Yap\n"
					+ " 3- Ogrenci Adına Gore Arama Yap\n" + " 4- Ders Adına Gore Arama Yap\n"
					+ " 5- Sınıf Bilgisine Gore Ogrencileri Bul\n" + " 6- Ders Kredisine Gore Dersleri Bul\n"
					+ " 7- Cikis");
			System.out.print("\nIslem:");
			secim = scan.nextInt();
			switch (secim) {
			case 1:
				listele(bolumler);
				break;
			case 2:
				System.out.print("Aradiginiz bolumun adini giriniz:");
				bAd = scan.next();
				BolumAdAra(bolumler, bAd);
				break;
			case 3:
				System.out.print("Aradiginiz ogrencinin adini giriniz:");
				oAd = scan.next();
				OgrAdAra(bolumler, oAd);
				break;
			case 4:
				System.out.print("Aradiginiz dersin adini giriniz:");
				dAd = scan.next();
				DersAdAra(bolumler, dAd);
				break;
			case 5:
				System.out.print("Aradiginiz sinifi giriniz:");
				oSnf = scan.nextInt();
				SnfAra(bolumler, oSnf);
				break;
			case 6:
				System.out.print("Aradiginiz krediyi giriniz:");
				dKredi = scan.nextInt();
				KrediAra(bolumler, dKredi);
				break;
			case 7:
				ctrl = 1;
				break;
			default:
				System.out.println("--------Yanlis giris! Lutfen tekrar islem seciniz------->");
			}
		}

	}

}
