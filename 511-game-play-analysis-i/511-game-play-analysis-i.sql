/* Write your PL/SQL query statement below */

Select player_id "player_id",to_char(min(event_date),'YYYY-MM-DD')"first_login"
from Activity
group by player_id;
