import java.sql.Connection;
/*
import java.sql.SQLException;
import java.sql.Statement;

public class MYsqlDemo {
    public static void main(String[] args)  {
        Connection connection=ConMysql.conmysql("work4");
        //增加数据
        Statement stmt;
        try{
            stmt= connection.createStatement();
            stmt.execute("insert  into work4_emp(name,gender,birthdate,salary,deptid)"
                    +"values ('压缩','男','2000-02-22','115000','2')");
            stmt.execute("delete from work4.work4_emp where id=10");
            stmt.execute("update work4.work4_emp set NAME='亚索' where id=14");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
*/
