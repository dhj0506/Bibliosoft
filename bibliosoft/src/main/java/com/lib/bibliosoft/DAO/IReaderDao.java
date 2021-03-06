package com.lib.bibliosoft.DAO;

import com.lib.bibliosoft.entity.Reader;

import java.util.Date;
import java.util.List;

/**
 * @Author: 毛文杰
 * @Description:
 * @Date: Created in 3:58 PM. 9/30/2018
 * @Modify By:
 */
public interface IReaderDao {
//  原生SQL实现更新方法接口
//  @Query(value = "update reader set reader_name=?1 where reader_id=?2 ", nativeQuery = true)
//  @Modifying
    void updateReader(Integer id, String sex, String readerName, String phone, String readerId, String email, String status, String password, Date registTime);

    List<Reader> findAll();
    Reader findById(Integer id);
    Reader findByReaderId(String id);
    void addReader(Reader reader);
    void deleteReader(Reader reader);
    Reader findByUsername(String name);
    List<Reader> searchReaderByPhoneOrName(String string);

    void updateReaderStatusById(Integer id, String status);

    Integer getBorrowCountByReaderId(String readerId);
}
