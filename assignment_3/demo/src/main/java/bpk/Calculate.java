package bpk;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Calculate extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        String word=request.getParameter("sentence");
        String c=request.getParameter("letter");

        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
       
        boolean contains=false;
        int nexIndex=-1;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if (ch==c.charAt(0)){
                contains=true;
                nexIndex=i+1;
                break;
            }
        }
       
        out.println("<h1>Sentence :</h1>"+word);
        out.println("<h1>Letter:</h1>"+c);
        if (contains)
        out.println("<h1>After the required character: </h1>" +word.substring(nexIndex));
        else 
        out.println ("The letter does not exist in the sentence");
    }
}


//Without html file

// public class Calculate extends HttpServlet {
//     public void doGet(HttpServletRequest request, HttpServletResponse response)
//     throws IOException, ServletException
//     {
//         response.setContentType("text/html");
//         PrintWriter out = response.getWriter();
//         out.println("<html>");
//         out.println("<head>");
//         out.println("<title>Assignment 3</title>");
//         out.println("<h2>Printing Number after a character-Java</title>");
//         out.println("</head>");
//         out.println("<body>");
//         out.println("Please Enter the values:");

//         String word=request.getParameter("sentence");
//         String c=request.getParameter("letter");


//         if (word != null || c != null) {
//             out.println("First Name:");
//             out.println(" = " +word+ "<br>");
//             out.println("Last Name:");
//             out.println(" = " +c);\
            
//             boolean contains=false;
//             int nexIndex=-1;
//             for(int i=0;i<word.length();i++){
//                  char ch=word.charAt(i);
//                 if (ch==c.charAt(0)){
//                     contains=true;
//                     nexIndex=i+1;
//                     break;
//                      }
//              }
//              if (contains)
//         out.println("<h1>After the required character: </h1>" +word.substring(nexIndex));
//         else 
//         out.println ("The letter does not exist in the sentence");

//         } else {
//             out.println("No Parameters, Please enter some");
//         }
//         out.println("<P>");
//         out.print("<form action=\"");
//         out.print("RequestParamExample\" ");
//         out.println("method=POST>");
//         out.println("Sentence:");
//         out.println("<input type=text size=20 name=sentence>");
//         out.println("<br>");
//         out.println("Letter");
//         out.println("<input type=text maxlength=1 pattern=[A-Za-z] name=letter >");
//         out.println("<br>");
//         out.println("<input type=submit>");
//         out.println("</form>");
//         out.println("</body>");
//         out.println("</html>");
//     }

//     public void doPost(HttpServletRequest request, HttpServletResponse res)
//     throws IOException, ServletException
//     {
//         doGet(request, res);
//     }
// }
