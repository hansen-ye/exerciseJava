### Swap.class
不使用一個暫存變數，將 a 與 b 兩個變數交換

第一種方式是使用 XOR 運算：  
a = a ^ b  
b = a ^ b  
a = a ^ b  
                         
第二種是使用加法與減法：  
a = a + b  
b = a - b  
a = a - b  
					 
第三種是使用乘法與除法：  
a = a * b  
b = a / b  
a = a / b  
                       
三種方式作用都相同，但第二種與第三種都可能會有溢位（overflow）的問題，所以最佳的解法是使用第一種 XOR 運算。

解釋 ：  
XOR 的三條運算改寫為 ：  
x = a ^ b  
y = x ^ b  
z = x ^ y   

然後透過簡單的數學代數運算，我們可以得到 y 的值為 ：  
y = (a ^ b) ^ b = a ^ b ^ b = a ^ (b ^ b) = a ^ 0 = a    

而 z 的值為 ：  
z = (a ^ b) ^ a = a ^ b ^ a = (a ^ a) ^ b = 0 ^ b = b  
***
