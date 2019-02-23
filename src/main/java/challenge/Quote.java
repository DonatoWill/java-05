package challenge;


public class Quote {

	private Integer id;
	private String actor;
	private String quote;

	public Quote(){}

	public Quote(Integer id,  String actor, String quote) {
		this.id = id;
		this.actor = actor;
		this.quote = quote;

	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActor() {
		return this.actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getQuote() {
		return this.quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

}
