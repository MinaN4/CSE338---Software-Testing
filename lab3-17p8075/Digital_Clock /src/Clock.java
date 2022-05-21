public class Clock
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;
    public Clock()
    {
        this.hours= new NumberDisplay(0,23);
        this.minutes= new NumberDisplay(0,59);
        updateDisplay();
    }
    public Clock(int hour, int minute)
    {

        this.hours = new NumberDisplay(0, 23);
        this.minutes = new NumberDisplay(0, 59);
        this.setTime(hour, minute);

    }
    public int returnHours()
    {
        return this.hours.getValue();
    }
    public int returnMinutes()
    {
        return this.minutes.getValue();
    }
    public void timeTick ()
    {
        this.minutes.increment();

        if(this.minutes.didWrapAround())
        {
            this.hours.increment();
        }
        updateDisplay();
    }
    public void setTime(int hour, int minute)
    {
        this.minutes.setValue(minute);
        this.hours.setValue(hour);
        this.updateDisplay();

    }
    public String getTime()
    {
        return this.displayString;
    }
    private void updateDisplay()
    {
        this.displayString = this.hours.getDisplayValue()+":"+
                this.minutes.getDisplayValue();

    }
}