import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class roomAllocation {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        ArrayList<rooms> roomArr = new ArrayList<>();
        for(int i=0;i<n;i++){
            long arrival = rdr.nextLong();
            long departure = rdr.nextLong();
            roomArr.add(new rooms(0,arrival,departure,i));
        }
        roomComparator comp = new roomComparator();
        Collections.sort(roomArr,comp);
//        for(rooms r:roomArr){
//            System.out.println(r.arrivalTime+" "+r.departureTime);
//        }
        long currentRoom =2;
        long LastVacantRoom = 1;
        long LastVacantTime = roomArr.get(0).departureTime;
        long LastVacantIndex = 0;
        roomArr.get(0).roomNumber =1;

        for(int i=1;i<n;i++){
            if(roomArr.get(i).arrivalTime > LastVacantTime){
                roomArr.get(i).roomNumber = LastVacantRoom;
                LastVacantIndex++;
                LastVacantTime = roomArr.get((int) LastVacantIndex).departureTime;
                LastVacantRoom = roomArr.get((int) LastVacantIndex).roomNumber;
            }
            else {
                roomArr.get(i).roomNumber = currentRoom++;
            }
        }
        System.out.println(currentRoom-1);
//        for(rooms r:roomArr){
//            System.out.print(r.roomNumber+" ");
//        }
        StringBuilder ans = new StringBuilder("");
        Collections.sort(roomArr,(a,b) -> a.index - b.index);
        for(rooms r:roomArr){
            ans.append(r.roomNumber).append(" ");
        }
        System.out.println(ans);
    }
}

class rooms{
    long roomNumber;
    long arrivalTime;
    long departureTime;
    int index;

    public rooms(long roomNumber, long arrivalTime, long departureTime, int index) {
        this.roomNumber = roomNumber;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.index = index;
    }
}

class roomComparator implements Comparator<rooms>{
    @Override
    public int compare(rooms o1, rooms o2) {
        if(o1.departureTime> o2.departureTime){
            return 1;
        }
        if(o1.departureTime == o2.departureTime && o1.arrivalTime> o2.arrivalTime){
            return 1;
        }
        return -1;
    }
}

