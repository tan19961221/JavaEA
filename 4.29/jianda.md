
### 阐述redirect和request dispatch的区别.   
1、RequestDispatch，请求转发是在同一个请求中完成的，因此整个过程只包含一个请求。  向目标组件传送了当前的request, response，所以下一个组件包含了上一个组件的信息。  
2、Redirect重定向，一旦调用就表示这个请求结束了。因此在初次访问时，servlet响应返回给客户端一个重定向的地址，客户端再发送第二个请求去访问该地址。因而整个过程包含两个请求。  没有向下一个组件发送任何的信息，只是向url栏重新置入地址。

### 阐述redirect location的不同形式. 

response.redirect是请求转向，location.href 是浏览器转向．
Response.Redirect方法导致浏览器链接到一个指定的URL。

当Response.Redirect()方法被调用时，它会创建一个应答， 应答头中指出了状态代码302（表示目标已经改变）以及新的目标URL。 浏览器从服务器收到该应答，利用应答头中的信息发出一个对新URL的请求。 这就是说，使用Response.Redirect方法时重定向操作发生在客户端，总共涉及到两次与服务器的通信（两个来回）： 第一次是对原始页面的请求，得到一个302应答， 第二次是请求302应答中声明的新页面，得到重定向之后的页面。  

如果你请求含有response.redirect的页面时，在服务器端已经给你转向了，服务器遇到该语句时直接转向目的页面． 而location.href一般是浏览器遇到该语句时，重新向另一个地址进行请求，可见，response.redirect只是一次请求，而客户端使用location转向时要两次向服务器进行请求． 因为服务器端是不存在window等浏览器窗口的，所以location绝对不会是服务端代码，只能在客户端输出．

事实上，如果在客户端中，js语句中同样也存在redirect语句，这时两者的作用一样． 但机理不同，redirect只是一个转向语句，遇到该语句时，直接转向，客户端是两次请求的． 而location相当于你在地址栏中输入了地址后按回车！ 如果对转向没有控制的话，两者在客户端是一样的． 但response.redirect往往用于服务端，而location只能用在客户端！

也就是说location.href是在客户端提出的重定向，response.redirect是在服务器端提出的重定向。window.location.href 语句可以实现一个框架的页面在执行服务器端代码后刷新另一个框架的页面



