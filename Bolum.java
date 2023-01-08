package VizeOdevi;

public class Bolum {
	private int bolNo;
	private String bolAd;
	public Ogrenci ogrenciler[];
	public Ders dersler[];

	public int getBolNo() {
		return bolNo;
	}

	public void setBolNo(int bolNo) {
		this.bolNo = bolNo;
	}

	public String getBolAd() {
		return bolAd;
	}

	public void setBolAd(String bolAd) {
		this.bolAd = bolAd;
	}

	public Bolum(int bolNo, String bolAd, Ogrenci[] ogrenciler, Ders[] dersler) {
		super();
		this.bolNo = bolNo;
		this.bolAd = bolAd;
		this.ogrenciler = ogrenciler;
		this.dersler = dersler;
	}

}
