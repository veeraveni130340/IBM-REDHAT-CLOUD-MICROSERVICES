package orgexample_spring_demo.model;

public class InternationCD extends CD {
	
	private Integer cdId;
	private String cdName,language;
	
	
	public Integer getCdId() {
		return cdId;
	}
	public void setCdId(Integer cdId) {
		this.cdId = cdId;
	}
	public String getCdName() {
		return cdName;
	}
	public void setCdName(String cdName) {
		this.cdName = cdName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public InternationCD() {
		super();
	}
	public InternationCD(Integer cdId, String cdName, String language) {
		super();
		this.cdId = cdId;
		this.cdName = cdName;
		this.language = language;
	}




	@Override
	public String getDetails() {
		return "CD ID" + cdId + " CD Name: " + cdName + " CD Language: " + language;
	}

}
