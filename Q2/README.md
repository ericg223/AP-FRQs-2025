## Question 2 Analysis
### SignedText

This section contains my analysis of Question 2 (Writing Classes):

#### My initial approach during the exam:
- I copy the class Title. I notice that I need to create a constructor, two methods, and instance variables. For the addSignature method, I overthink the problem and did not read the problem carefully. In my solution I tried to take into account if a signature appears in the middle of the text instead of the beginning and the end. However, the problem did not ask for this. There are three different outcome for the addSignature method. One is when the signature appears on the beginning of the text. Another is it appear at the end of the text. Lastly, it doesn't appear at all. In my orginal solution, I check if it was at the end of the text by: (index == text.length()-getSignature().length()-1 && index > 0) However, it was not necessary to check if the signature appears at the middle because it never said it will in the question. 
  
#### My revised solution after review:
- This problem was an increase of difficulty compare to question 1. I did the same thing for instance variables, constructor, and getSignature method. The one I did differently was inside the addSignature method. After reviewing the question I decided to create if statement to check if the signature appear at the beginning of the text and none. Then the else will be at the end. 
  
#### Key concepts tested in this question:
- Concepts that were tested in this question was knowing how to create constructor and creating methods inside a class. If also tested on if statements and string methods. 
  
#### What I learned from revisiting this problem:
- I should not assume things that weren't ask in the question and do everything the question ask for specifically. 
