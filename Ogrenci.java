package VizeOdevi;

public class Ogrenci {
	private int bolNo;
	private int ogrID;
	private int ogrSinif;
	private String ogrAd;
	private String ogrSoyad;
	private static int ogrSayi = 0;

	public int getBolNo() {
		return bolNo;
	}

	public void setBolNo(int bolNo) {
		this.bolNo = bolNo;
	}

	public int getOgrID() {
		return ogrID;
	}

	public void setOgrID(int ogrID) {
		this.ogrID = ogrID;
	}

	public int getOgrSinif() {
		return ogrSinif;
	}

	public void setOgrSinif(int ogrSinif) {
		this.ogrSinif = ogrSinif;
	}

	public String getOgrAd() {
		return ogrAd;
	}

	public void setOgrAd(String ogrAd) {
		this.ogrAd = ogrAd;
	}

	public String getOgrSoyad() {
		return ogrSoyad;
	}

	public void setOgrSoyad(String ogrSoyad) {
		this.ogrSoyad = ogrSoyad;
	}

	public Ogrenci(int bolNo, int ogrSinif, String ogrAd, String ogrSoyad) {
		super();
		this.bolNo = bolNo;
		this.ogrSinif = ogrSinif;
		this.ogrAd = ogrAd;
		this.ogrSoyad = ogrSoyad;
		this.ogrID = ++ogrSayi;
	}

}
