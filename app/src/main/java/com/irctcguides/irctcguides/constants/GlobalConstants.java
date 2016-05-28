package com.irctcguides.irctcguides.constants;

import android.graphics.drawable.Drawable;

import com.irctcguides.irctcguides.models.Guide;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ram on 27/05/16.
 */

public class GlobalConstants {

    public static List<Guide> getGuidesData(){
        List<Guide> guideList = new ArrayList<>();

        guideList.add(
                new Guide(
                        1,
                        "Tatkal Ticket Booking",
                        "tatkal",
                        "The Tatkal Scheme is an Indian Railways scheme for booking journeys at very short notice. It was introduced by the then railway minister Nitish Kumar in all forms of reserved class in almost all the Mail/ Express trains in India. These tickets can be booked over counter and on the internet. Tatkal Booking starts one day in advance (reduced from 2 days) excluding the day of journey e.g. for a journey on 3rd, bookings would open at 10 am on 2nd. However, the day of journey is defined as the day of chart preparation.<br><br>"+
                        "<strong>How to do Tatkal Ticket Booking?</strong><br>"+
                        "• Click on Plan My Journey page.<br>" +
                        "• If the From/To station selected by you are correct in the route of the train then select Date of Journey.<br>" +
                        "• Select Ticket Type as e-ticket.<br>" +
                        "• Then Click on Submit button.<br>" +
                        "• The Advance Reservation Period (ARP) of Tatkal scheme is reduced from two days to one day excluding the day of journey from the train originating station. For example, if train is to depart from the originating station on the second of the month, the Tatkal quota booking for that particular train will open at 10:00 hrs on the first of the month from originating station.<br>"+
                        "<br><strong>Tatkal Ticket Booking Tips:</strong><br>"+
                        "• Create more than one credentials for logging on to irctc website. If you have only one login details, borrow one from your friend or family. Trying to book ticket parallely using multiple browser/computer always increases chances of getting a tatkal ticket. DO NOT use same irctc login details on multiple browsers simultaneously as irctc can detect it and log you out from all sessions.<br>" +
                        "• Make sure tatkal quota for your journey opens one day in advance. It might open two or more days in advance, if the train reaches your boarding station on second or more days of its running. For example, if you want to book tatkal ticket from Nagpur to chennai in Chennai Rajdhani Express (12434), the tatkal booking opens 2 days in advance in this case from your journey date as the train reaches Nagpur on 2nd day of running.<br>" +
                        "• Keep Id card details such as PAN card or driving license of one of the passengers handy. This way you do not have to search for it after you have started the booking process.<br>" +
                        "• Save some time by entering passenger details beforehand. Fill passenger details before 10am for ac class and before 11am for non-ac class, you need not fill them again and save a couple of minutes this way which increases your probability of getting confirmed tatkal ticket. This is how you should do so:<br>" +
                        "• Login into the irctc website 5-10 minutes ago and do these before 10am for ac ticket and 11am for non-ac ticket.<br>" +
                        "• Select origin destination, choose date as today’s date and enter ticket type and click on ‘Find Trains’. Now select quota as TATKAL and click on BOOK NOW for today’s date for any train.<br>" +
                        "• Enter passenger details including id card details and mobile number. Now instead of clicking on ‘Next’ which will take you to payment, click on ‘Replan’ which takes to back to the ‘Plan My Journey’ page.<br>" +
                        "• Exactly at 10am (or at 11am for FC, SL and 2S) put your correct journey date and try booking. When you come on Passenger Details page, you will see that all the details which you entered before are still there. So just enter the captcha and click on ‘Next’ for payment.<br>" +
                        "• For AC classes, try booking in 2A (second ac) first. For most of the routes, 2A gets filled less quickly than 3A inspite of lesser berths.<br>" +
                        "• Avoid trying to book ticket on trains for which tatkal tickets have already exhausted. Keep checking parallely current berth availability for tatkal quota on trainman.<br>" +
                        "• Make payment using netbanking (preferable by HDFC or ICICI bank) as this is the fastest mode of payment. If you choose to pay by cards you need to enter long card numbers and lot of other details which takes time. Since irctc has made OTP verification mandatory so one should keep their phone nearby to get OTP details from phone.<br>" +
                        "• If you are not able to book tatkal ticket for ac classes, you can try your luck for non-ac classes at 11am again.<br>" +
                        "• Even after following all these if you get a waiting tatkal ticket, you can always check the chances of ticket confirmation on Trainman"
                )
        );

        guideList.add(
                new Guide(
                        1,
                        "Setting up destination alert",
                        "alert",
                        "Destination Alert is a facility to get a wake-up call on your mobile from a call centre of the Indian Railway Catering and Tourism Corporation (IRCTC), half-an-hour before the scheduled arrival at your station.<br><br>"+
                        "<strong>How to set destination alert?</strong><br>"+
                        "• Dial 139 from the Mobile you want you want to set Destination Alert<br>" +
                        "• Choose your preferred language<br>" +
                        "• Select option 7 from the IVR main menu<br>" +
                        "• Press -2 for Destination Alert<br>" +
                        "• Enter your 10 digit PNR number<br>" +
                        "• Press 1 to confirm your PNR number<br>"+
                        "Destination alert shall be set for the given PNR Number, you will also receive a confirmation message on Your mobile as “DESTINATION ALERT call has been set on your mobile number for <Destination Station Name>”. "
                )
        );

        guideList.add(
                new Guide(
                        1,
                        "Order Food through IRCTC while travelling.",
                        "catering",
                        "E-catering service has been started by IRCTC exclusively for passengers travelling in trains without pantry where passenger can book preferred meal through e-catering website as well as through phone and SMS also. The website address is www.ecatering.irctc.co.in and phone numbers are 1323 and SMS MEAL to 139.<br><br>" +
                        "<a href src='http://www.ecatering.irctc.co.in/eCatering/'>Website</a><br><br>"+
                        "<strong>How Can I book e-catering service through website?</strong><br>" +
                        "Any passenger having valid confirmed reservation ticket may book the meal through website as well the phone. The trains in which e-catering services are available are also uploaded for information of the passengers. The process of booking is as under: -<br>" +
                        "1. Passenger will enter the PNR. Stations list shall appear/display in drop down menu. Passenger may choose the station he/she wishes to book meal on. After which, vendor menu will open along with item prices.<br>" +
                        "2. Passenger may choose the vendor and the meals to be booked. Prices of meal will be displayed with the meals.<br>" +
                        "3. On confirmation of booking, e-payment for the transaction is to be made.<br>" +
                        "4. On completion of transaction, SMS and email shall be generated and sent to the customer as well as the service provider.<br>" +
                        "5. The SMS and email shall have the details of the order. The SMS content to passenger shall have an OTP (One Time Password) which will be used for verification by the service provider on the mobile application at the time of delivery of meal.<br>" +
                        "6. In addition to the above SMS and email at the time of booking of meal, SMS and email shall again be forwarded to the passenger 02 hours before the scheduled delivery time at the station for convenience of customer. Further, an email shall also be sent to the passenger 24 hours before the scheduled delivery time at the station.<br><br>"+
                        "<strong>How Can I book e-catering service through phone?</strong><br>" +
                        "Passenger may book e-catering service by calling 1323 for waitlisted as well as confirmed ticket. The booking shall be made by the call center executive and subsequently, the passenger shall be informed of confirmed meal booking through SMS and email.<br>" +
                        "1. The SMS and email shall have the details of the order. The SMS content to passenger shall have an OTP which will be used for verification by the service provider on the mobile application at the time of delivery of meal.<br>" +
                        "2. In addition to the above SMS and email at the time of booking of meal, SMS and email shall again be forwarded to the passenger 02 hours before the scheduled delivery time at the station for convenience of customer. Further, an email shall also be sent to the passenger 24 hours before the scheduled delivery time at the station."
                )
        );

        guideList.add(
                new Guide(
                        1,
                        "What is VIKALP Scheme?",
                        "vikalp",
                        "Under Vikalp, wait-listed passengers of a train can opt for confirmed seats on alternate trains.<br><br>" +
                        "<strong>Terms and conditions:</strong><br>"+
                        "• No refund will be provided and also no extra money will be charged for difference in fares.<br>" +
                        "• A passenger allotted alternate seat could travel in the alternate train on authority of the original ticket.<br>" +
                        "• Wait-listed passengers of a train will not be allowed to board it if allotted seat on alternate train.<br>" +
                        "• In case, if the wait listed passenger travels on the same train, he or she will be treated as travelling without ticket and charged accordingly.<br>" +
                        "• Opting for the scheme did not mean a confirmed berth will be provided to a passenger in alternate train. It is subjected to availability.<br>" +
                        "• Once confirmed in alternate train, the ticket cancellation charges will be as per the berth or train status in the alternate train.<br>" +
                        "• Either all passengers of a PNR or none will be transferred to alternate train in same class.<br>" +
                        "• In rare situations, passengers who have been provided alternate accommodation might get dropped/re-allotted in alternate train due to last minute change in composition of the alternate train at the time of chart preparation. So, passengers who have been provided alternate accommodation should check PNR status also after preparation of charts of the alternate train for final status.<br>" +
                        "• Once an ATAS passenger has been allotted alternate accommodation, journey modification will not be permitted. If required, the passenger will have to cancel the ticket and book a fresh ticket for modified journey.<br>" +
                        "• When a passenger who has been allotted alternate accommodation has not performed his journey in the alternate train, he can claim for refunds by filing a TDR request."
                )
        );

        guideList.add(
                new Guide(
                        1,
                        "Know about TDR",
                        "tdr",
                        "The TDR means Ticket Deposit Receipt. In case of i-ticket, the TDR will be issued by" +
                        "the Railway Authority, while in E-ticket there is no TDR issued But the customer has" +
                        "to file their claim through online facility provided by IRCTC. The link is available in" +
                        "www.irctc.co.in – My Transaction – File TDR for any of the following reason. The" +
                        "refund will be processed by concerned Zonal Railway as per extent Railway Rules." +
                        "Once the refund will be received from concerned Zonal Railway the refunded" +
                        "amount will be credited back to customer account respectively.<br><br>" +
                        "<strong>When can Customer file TDR :-</strong><br>" +
                        "In case of<br>" +
                        "1. Train Cancelled By Railways<br>" +
                        "2. Train running Late by More than Three hours<br>" +
                        "3. Difference of Fare in case proper coach not attached<br>" +
                        "4. AC Failure – Original TTE certificate is required<br>" +
                        "5. Travelled without proper ID proof – Original EFT is required<br>" +
                        "6. Wrongly charged by TTE – Original EFT is required<br>" +
                        "7. Party partially travelled Claim (except Rajdhani/Shatabadi/Jan Shatabadi Exp) – TTE Original certificate is required<br>" +
                        "8. Passenger Not travelled – Ticket type in General<br><br>" +
                        "<strong>NON ELIGIBILITY OF TDR:</strong><br>" +
                        "1. Other than Railway Fault<br>" +
                        "2. Confirmed Tatkal ticket if passenger Not travelled<br>" +
                        "3. If cases not received within 30 days from Date of Journey.<br>" +
                        "4. Partially travelled Claim (Short of booked destination) in Rajdhani/Shatabadi/Jan Shatabadi Exp. <br><br>"+
                        "<strong>Instruction for customer for geting refund on i-tickets are:-</strong><br>" +
                        "1. Surrender the I-Ticket with the Station Master and obtain a Ticket Deposit Receipt (TDR).<br>" +
                        "2. Send claim for refund to the following address attaching the original TDR to:<br>" +
                        "&nbsp;&nbsp;G&nbsp;eneral Manager (Operations),<br>" +
                        "&nbsp;&nbsp;&nbsp;Indian Railway Catering & Tourism, Corporation Ltd.,<br>" +
                        "&nbsp;&nbsp;&nbsp;2nd Floor, STC Building,<br>" +
                        "&nbsp;&nbsp;&nbsp;1, Tolstoy Marg, New Delhi - 110 001.<br>" +
                        "3. IRCTC will process the refund claim with the Railway Administration and refund granted by the Railway shall be credited to customer’s account accordingly. "
                )
        );

        return guideList;
    }

}
