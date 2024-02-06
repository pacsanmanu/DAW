function convertTime(seconds) {
    const minute = 60;
    const hour = 3600;
    const day = 86400;
  
    const days = Math.floor(seconds / day);
    seconds %= day;
  
    const hours = Math.floor(seconds / hour);
    seconds %= hour;
  
    const minutes = Math.floor(seconds / minute);
    seconds %= minute;
  
    return {
      days,
      hours,
      minutes,
      seconds
    };
  }
  
  const totalseconds = process.argv[2];
  const time = convertTime(totalseconds);
  
  console.log(`Optimized time for ${totalseconds} seconds:`);
  console.log(`Days: ${time.days}`);
  console.log(`Hours: ${time.hours}`);
  console.log(`Minutes: ${time.minutes}`);
  console.log(`Seconds: ${time.seconds}`);
  