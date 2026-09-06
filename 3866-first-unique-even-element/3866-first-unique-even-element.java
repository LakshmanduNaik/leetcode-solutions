class Solution 
{
    public int firstUniqueEven(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res=-1;
        for(int i:nums)
        {
            if(map.get(i)==1 && i%2==0)
            {
                    res=i;
                    break;
            }
        }
        return res;
        
    }
}