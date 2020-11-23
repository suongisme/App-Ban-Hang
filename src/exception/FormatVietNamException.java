/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author SuongNguyen
 */
public class FormatVietNamException extends Exception{
    private String message;

    public FormatVietNamException(String message) {
        super(message);
    }

    public String getMessage() {
        return super.getMessage();
    }
}
