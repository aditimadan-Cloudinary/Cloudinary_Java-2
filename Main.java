import com.cloudinary.Cloudinary;
import com.cloudinary.Api;
import com.cloudinary.utils.ObjectUtils;


class Main {
  public static void main(String[] args) throws Exception {
   /* Cloudinary cloudinary = new
		Cloudinary("cloudinary://549185954311254:LQwYOwL9Ij9ioS6lCCwdB5K7ErY@aditimadan");
    Api api = cloudinary.api();*/
    AestheticsTransformations at=new AestheticsTransformations();
    at.printTransformation();
       
  }
}