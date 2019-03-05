package test.functionForClass;

public abstract class ClassOperation<T,PK> {
	private Class<T> entityClass;
	
	public ClassOperation(Class<T> entityClass){
		this.entityClass = entityClass;
	}
	
	protected Class<T> getEntityClass(){
		return entityClass;
	}
	
	public String getSimpleName(){
		return getEntityClass().getSimpleName();
	}
	
	public String getName(){
		return getEntityClass().getName();
	}
	
	public String getTypeName(){
		return getEntityClass().getTypeName();
	}
	
	public String getCanonicalName(){
		return getEntityClass().getCanonicalName();
	}
}
