class TopVotedCandidate {
    int[]persons;
    int[]times;

   public TopVotedCandidate(int[] persons, int[] times) {
        this.times=times;
        int[] maxVotes=new int[persons.length];
        this.persons=new int[persons.length];
        int max=0,maxp=-1;
        //Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<times.length;i++)
        {
           // max=-1;
           // maxp=-1;

            maxVotes[persons[i]]++;
            //map.put(persons[i],i);
           if(maxVotes[persons[i]]>=max) 
           {
               max=maxVotes[persons[i]];
               maxp=persons[i];
           } 

            /*for(int j=0;j<maxVotes.length;j++)
            {
                if(maxVotes[j]>max)
                {
                    max=maxVotes[j];
                    maxp=j;
                }
                    if(maxVotes[j]==max)
                    {
                        if(map.getOrDefault(j,-1)>map.getOrDefault(maxp,-1))
                        {
                            max=maxVotes[j];
                            maxp=j;
                        }
                    }
            }*/
            this.persons[i]=maxp;
        }
    }

    public int q(int t) {
        int i;
        for(i=1;i<persons.length;i++)
        {
            if(times[i-1]<=t && times[i]>t)
                return persons[i-1];
            else if(times[i]==t)
                return persons[i];
        }

        return this.persons[persons.length-1];


    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */