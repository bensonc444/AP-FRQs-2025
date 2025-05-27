public int dogWalkShift(int startHour, int endHour)
{
  int earnings = 0;
  for (int i= startHours;i<=endHours;i++){
    int dogsWalked=walkDogs(i);
    earnings +=dogsWalked*5;
    if (if(hour >= 9 && hour <= 17) || dogsWalked == maxDogs){
      earnings +=3;
    }
  }
  return earnings;
}
