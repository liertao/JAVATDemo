package let.samp;
/**
 * 实现类： 继承公用的BaseService，实现底层代码封装；底层会自动
 * 			获取泛型类型进行HQL拼装。
 * @author ertaoL
 * 可以替换两种不同泛型，都会输出泛型类型和类名
 *
 */
public class BaseServiceImpl extends BaseService<Teacher> {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new BaseServiceImpl();
	}
}
