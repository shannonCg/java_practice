package test_simple;

public class ObjectEquals {
	
	private Long id;
	
	private String role;
	
	private String loginId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	public boolean equalsExcludeId(Object obj){
		if (this == obj){
			return true;
		}
		if (obj instanceof ObjectEquals){
			ObjectEquals userRole = (ObjectEquals) obj;
			return role.equals(userRole.getRole())&&
				   loginId.equals(userRole.getLoginId());
		}
		return false;
	}
}
