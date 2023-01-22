package entities;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
	
	private String name;
	private Set<Content> subscribedContents = new LinkedHashSet<>();
	private Set<Content> concludedContents = new LinkedHashSet<>();
	
	
	public void subscribeBootcamp(Bootcamp bootcamp) {}
	
	public void progress() {}
	
	public void calculateTotalXp() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getSubscribedContents() {
		return subscribedContents;
	}

	public void setSubscribedContents(Set<Content> subscribedContents) {
		this.subscribedContents = subscribedContents;
	}

	public Set<Content> getConcludedContents() {
		return concludedContents;
	}

	public void setConcludedContents(Set<Content> concludedContents) {
		this.concludedContents = concludedContents;
	}

	@Override
	public int hashCode() {
		return Objects.hash(concludedContents, name, subscribedContents);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(concludedContents, other.concludedContents) && Objects.equals(name, other.name)
				&& Objects.equals(subscribedContents, other.subscribedContents);
	}

	
	
}
