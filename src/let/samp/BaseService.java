package let.samp;

import java.lang.reflect.ParameterizedType;
/**
 * 说明：一般应用场景：在用到Hibernate的HQL语句时，使用的是面向对象的sql语句，在对底层进行
 * 				封装的时候需要根据不同的模块得到不同的泛型类名拼接HQL，实现代码的复用（一般
 * 				是封装一些BaseDao、BaseService的基类供业务层调用，这样在业务层只需要关注
 * 				核心的业务逻辑代码即可），提高开发效率。
 * @author ertaoL
 * @param <T>泛型类型
 */
@SuppressWarnings("unchecked")
public class BaseService<T> {
	
	private Class clazz;
	
	public BaseService(){
//		System.out.println("this代表的是当前调用构造方法的对象："+this);
//		System.out.println("获取当前this对象的父类信息："+this.getClass().getSuperclass());
//		System.out.println("获取当前this对象的父类信息(包含泛型类型)："+this.getClass().getGenericSuperclass());
		ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
		clazz = (Class)type.getActualTypeArguments()[0];
		System.out.println("泛型类名："+clazz.getSimpleName());
		System.out.println("泛型类型："+clazz);
	}
	
	//.....利用clazz封装多模块公用方法
	
}
