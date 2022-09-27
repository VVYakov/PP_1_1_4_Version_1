package jm.task.core.jdbc.dao;


import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    @Override
    public void createUsersTable() {

    }

    @Override
    public void dropUsersTable()  {

    }

    @Override
    public void saveUser(String name, String lastName, byte age)  {

    }

    @Override
    public void removeUserById(long id)  {

    }

    @Override
    public List<User> getAllUsers()  {
        return null;
    }

    @Override
    public void cleanUsersTable()  {

    }

/*    private final Util util = new Util();
    private final Connection connection = util.getConnection();
    public UserDaoJDBCImpl() {
    }
    public void createUsersTable() {

        try ( Statement statement = connection.createStatement();) {
            statement.executeUpdate("CREATE TABLE USERS (Id INT PRIMARY KEY AUTO_INCREMENT , name VARCHAR(60), lastName VARCHAR(60), age INT(3))");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dropUsersTable() {
        try (Statement statement = connection.createStatement();) {
            statement.executeUpdate("DROP TABLE USERS");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveUser(String name, String lastName, byte age)  {
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO USERS (name, lastName, age) VALUES(?, ?, ?)")) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lastName);
            preparedStatement.setByte(3, age);
            preparedStatement.executeUpdate();
            System.out.println("В базу данных добавлен User с именем - " + name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeUserById(long id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("DELETE from USERS where id=?")) {
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers()  {
        List<User> userList = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT ID, NAME, LASTNAME, AGE FROM USERS");
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getLong("ID"));
                user.setName(resultSet.getString("NAME"));
                user.setLastName(resultSet.getString("LASTNAME"));
                user.setAge(resultSet.getByte("AGE"));
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public void cleanUsersTable() {
        try (Statement statement = connection.createStatement();) {
            statement.executeUpdate("TRUNCATE TABLE USERS");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

 */
}