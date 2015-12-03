package application.models;

import java.time.LocalDate;

public class PublicationCopy {
	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	private int pId;		//publication Id
	private String pcId;	//publication copyId
	private LocalDate addDate;
	private Publication publication;


	public LocalDate getAddDate() {
		return addDate;
	}

	public void setAddDate(LocalDate addDate) {
		this.addDate = addDate;
	}

	private boolean available;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getPcId() {
		return pcId;
	}

	public void setPcId(String pcId) {
		this.pcId = pcId;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

//	public static int getNextPcId(){
//		return ++pcAmount;
//	}

//	public static String generateNextPcId(int pId){
//		return pId + "-" + getNextPcId();
//	}

	PublicationCopy(int pId, String pcId, LocalDate addDate, boolean available, Publication publication){
		super();
		this.pId = pId;
		this.pcId = pcId;
		this.addDate = addDate;
		this.available = available;
		this.publication = publication;
//		pcAmount++;
	}
}
