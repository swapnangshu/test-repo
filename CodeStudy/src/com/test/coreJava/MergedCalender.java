package com.test.coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.test.samplebeans.Meetings;


/*
 * This program merged the meeting object to come up with the all list of meeting which can be merged from series of Calendar
 * Here calender has been considered as 30 minute booking like 9:00 to 9:30 is meeting (0,1)
 * 11:00 to 13:00 is meeting (4,8) like that.
 * below function is going to give  the consolidated merged meeting.
 *  * Used Lamda expression to do the sort and Print
 *  InterviewCreek example 1
 * */

public class MergedCalender {

	public static void main(String[] args) {
		
		
		List<Meetings> initMeetings = Arrays.asList(new Meetings(1, 3), new Meetings(3, 5), new Meetings(2, 4));
		List<Meetings> afterMerge=new ArrayList<>();
		afterMerge=mergeRanges(initMeetings);	
		//Print Sorted list
		 System.out.println(" Print MERGED list ");
		afterMerge.forEach((Meetings m1)->System.out.println(m1.getStartTime()+" : "+m1.getEndTime())); 		

	}
	
	 public static List<Meetings> mergeRanges(List<Meetings> meetings) {
		 
		 List<Meetings> copyMeetingList= new ArrayList<>();
		 // Copy input list to another one object
		 for(Meetings m:meetings) {
			 Meetings copyMeet=new Meetings(m.getStartTime(),m.getEndTime());			 
			 copyMeetingList.add(copyMeet);
		 }
		 
		 // Sort the meeting copy object
		 copyMeetingList.sort((Meetings m1, Meetings m2)-> m1.getStartTime() - m2.getStartTime());
		 
		 //Print Sorted list
		 System.out.println(" Print Sorted list ");
		 copyMeetingList.forEach((Meetings m)->System.out.println(m.getStartTime()+" : "+m.getEndTime()));
		 
		 //create a merged Object by merging the meetings
		 List<Meetings> mergedMeetings= new ArrayList<Meetings>();
		 
		mergedMeetings.add(copyMeetingList.get(0));
		 
		for(Meetings currMeetings: copyMeetingList) {
			
			Meetings lastMergedMeetings = mergedMeetings.get(mergedMeetings.size() - 1);
			 
			 //if(currMeetings.getStartTime() <= lastMergedMeetings.getEndTime()) {
			 if(lastMergedMeetings.getEndTime() >= currMeetings.getStartTime()) {
				 lastMergedMeetings.setEndTime(Math.max(currMeetings.getEndTime(), lastMergedMeetings.getEndTime()));
				 
			 }else
				 
				 mergedMeetings.add(currMeetings);	
			 
		 }
		 
		 
				 
		return mergedMeetings;
		 
	 }

}
