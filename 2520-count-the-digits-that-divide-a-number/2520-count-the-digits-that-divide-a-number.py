class Solution(object):
    def countDigits(self, num):
        x=list(str(num))
        count=0
        for i in range(len(x)):
            d=int(x[i])
            if(num%d==0):
                count+=1
        return count