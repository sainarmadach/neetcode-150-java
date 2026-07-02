class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map= new HashMap<>();

        for(String str:strs)
        {
            String fre=freqString(str);

            if(map.containsKey(fre))
            {
                map.get(fre).add(str);


            }
            else
            {
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(fre,list);
            }
        }
        return new ArrayList<>(map.values());
    }

    public String freqString(String str)
    {
        int count[]=new int[26];
        StringBuilder b = new StringBuilder();

        for(char c:str.toCharArray())
        {
            count[c-'a']++;
        }

        char c= 'a';
        for(int i:count)
        {
            b.append(i);
            b.append(c);
            c++;

        }
        return b.toString();



    }


}


