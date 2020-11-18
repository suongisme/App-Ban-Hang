/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author SuongNguyen
 */
public interface DAO<T, V> {
    public void insert(T entity);
    public void delete(V id);
    public void update(T entity);
    public T selectByID(V id);
    public List<T> selectAll();
    public List<T> selectBySQL(String sql, Object...x);
}
