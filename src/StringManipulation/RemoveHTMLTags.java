/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StringManipulation;

/**
 *
 * @author catalvasfa_SD2082
 */
public class RemoveHTMLTags {
    public String removeHTML(String str) {
       str = str.replaceAll("\\<.*?\\>", "");
       return str;
   }
}
