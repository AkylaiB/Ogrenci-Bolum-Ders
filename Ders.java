package VizeOdevi;

public class Ders {
	private int bolNo;
	private int dersID;
	private int dersKredi;
	private String dersAd;
	private static int dersSayi = 0;

	public int getBolNo() {
		return bolNo;
	}

	public void setBolNo(int bolNo) {
		this.bolNo = bolNo;
	}

	public int getDersID() {
		return dersID;
	}

	public void setDersID(int dersID) {
		this.dersID = dersID;
	}

	public int getDersKredi() {
		return dersKredi;
	}

	public void setDersKredi(int dersKredi) {
		this.dersKredi = dersKredi;
	}

	public String getDersAd() {
		return dersAd;
	}

	public void setDersAd(String dersAd) {
		this.dersAd = dersAd;
	}

	public Ders(int bolNo, int dersKredi, String dersAd) {
		super();
		this.bolNo = bolNo;
		this.dersKredi = dersKredi;
		this.dersAd = dersAd;
		this.dersID = ++dersSayi;
	}

}
