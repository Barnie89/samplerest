//package codingPractice;
//
//public class javaScriptCpde {
//
//	
//	var x= [10,20,25,100,-1]
//
//			x.map(function(value){
//			    value= value+2
//			        console.log(value)
//			    
//			})
//			x.filter(function(value){
//			    if(value>18){
//			       console.log(value) 
//			    }
//			})
//			console.log("Max value ",Math.max(...x))
//			console.log("Min value ",Math.min(...x))
//
//			console.log("Sorted value ",x.sort())
//			console.log("reversed value ",x.reverse())
//
//			//Sort
//			var y=x.sort(function(a,b){
//			    return a-b
//			})
//
//			console.log("Ascending order ",y)
//
//			var z= x.sort(function(a,b){
//			    return b-a
//			})
//			console.log("Descending order ",z)
//
//			var f= "uuwhjdj@@AADD#^&***()jj12345_67ldj)((*"
//			var g = f.replace(/[_\W]/g,'')
//			console.log(g)
//
//			var h= "AAAGHHJKllkjjbjnj"
//			var o = h.replace(/[\A-Z]/g,'')
//			console.log(o)
//
//			// Reverse
//			var y="-123"
//			c= y.split('').reverse().join('');
//			c= parseInt(c) * Math.sign(y)
//			console.log("Reverse value ",c)
//
//			//Map
//			var x= new Map()
//			x.set("name","Muthu")
//			x.set("Age","32")
//			x.set("name1","Padma")
//			x.set("Age1","28")
//
//			console.log(x.has("name"))
//
//			for(let[l3,l4] of x.entries()){
//			    console.log(l3,l4)
//			}
//
//			//CallBack Fn
//			function multiply(a,b,callback){
//			    result = a*b
//			    callback(result)
//			}
//
//			function result(sum){
//			    console.log("Result is ",sum)
//			}
//
//			multiply(5,2,result)
//
//			var c= "Muthu"
//			const t= new RegExp("u",'g')
//			const count = c.match(t).length
//			console.log("Repeating Character ",count)
//
//			// Duplicate and Position
//			str= "Muthu"
//			    for(var i = 0; i <= str.length; i++) {
//			        for(var j = i+1; j <= str.length; j++) {
//			            if(str[j] == str[i]) {
//			                k=i+1
//			                l=j+1
//			                console.log("repeat char " +str[i]+"is present at "+k+ "and " +l)
//			            }
//			        }
//			    }
//			    
//			//Duplicate and count    
//			var re= "MuthuPadma"    
//			var d= re.split("")
//			var m= new Map()
//			for(var c of d){
//			if(m.has(c)){
//			    m.set(c,m.get(c)+1)
//			}else{
//			    m.set(c,1)
//			}
//			}
//			for(let[i1,i2]of m)
//			{
//			    if(i2>1)
//			    {
//			        console.log(i1+"count"+i2)
//			    }
//			}
//
//			//Max No in Array
//			var v= [10,20,30,100]
//			var max=v[0]
//			for(i=1;i<v.length;i++){
//			    if(v[i]>max){
//			        max=v[i]
//			        
//			    }
//			}
//			console.log("Max no ",max)
//
//			//Missing No in Array
//			var arr=[10,11,13,15]
//			var n= arr.length;
//			var res=0
//			for(i=arr[0];i<=arr[n-1];i++){
//			    if(i==arr[res]){
//			        res++
//			    }
//			    else{
//			        console.log("Missing No in array ",i)
//			    }
//			}
//
//			//Duplicate Elements in Array
//
//			var original=["muthu","rajesh","padma","muthu","padma"]
//			var duplicate=[]
//
//			for(var element of original){
//			    if(!duplicate.includes(element)){
//			        duplicate.push(element)
//			    }
//			}
//
//			console.log("Arrays contain Duplicate ",original)
//			console.log("Arrays Not contain Duplicate ",duplicate)
//
//			var c= "9789726704"
//
//			console.log(c.substring(0,3)+-+c.substring(3,6)+-+c.substring(6,10))
//			// Sum oF Odd nos in array
//			var d=[1,2,3,4,5,6,8]
//			n=d.length
//			var f=[]
//
//			for( i=0;i<n;i++){
//			    if(d[i]%2!==0){
//			        console.log("Odd No "+d[i])
//			        f.push(d[i])
//			    }
//			}
//			var g=f.reduce(function(x,y){
//			    return x+y
//			})
//
//			console.log("Sum of odd nos "+g)
//
//			// Sum of even nos in array
//
//			var f= [1,2,3,4,5,6]
//			n= f.length
//			var  sum=0
//			for( i=0;i<n;i++){
//			    if(f[i]%2==0){
//			        console.log("Even no ",f[i])
//			        sum=sum+f[i]
//			        
//			    }
//			}
//			console.log("sum of even no ",sum)
//
//			//Moving Zero to End of Array
//			var t1=[1,0,2,5,0,8,0,6]
//			n=t1.length
//			var counter=0
//
//			for(i=0;i<n;i++){
//			    if(t1[i]!=0){
//			        t1[counter]=t1[i]
//			        counter++
//			    }
//			}
//
//			while(counter<n){
//			    t1[counter]=0
//			    counter++
//			}
//			for(i=0;i<n;i++)
//			console.log(t1[i])
//
//
//			//Second largest in array
//			var i= [12,25,35,50,75]
//			var sl,fl
//			n= i.length
//			if(i[0]>i[1]){
//			    fl=i[0]
//			    sl=i[1]
//			}else{
//			    sl=i[0]
//			    fl=i[1]
//			}
//
//			for(o=2;o<n;o++){
//			    if(i[o]>fl){
//			        sl=fl
//			        fl=i[o]
//			    }
//			    else if(i[o]>sl&& i[o]<fl){
//			        sl=i[o]
//			    }
//			}
//
//			console.log("Second largest ",sl)
//
//
//}
