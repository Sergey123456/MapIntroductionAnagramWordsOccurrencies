class TreeKey {
	public final int number;
	public final String word;
	
	public TreeKey(int number, String word) {
		this.number = number;
		this.word 	= word;
	}

	@Override
	public String toString() {
		return "TreeKey [number=" + number + ", word=" + word + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TreeKey other = (TreeKey) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
}
