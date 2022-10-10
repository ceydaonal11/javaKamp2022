public class CustomerManager  {
    //CustomerManagerın customerDalı var ve biz onun add ini çağıracağız.
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        //iş kodları yazılır
        customerDal.add();

    }
}
