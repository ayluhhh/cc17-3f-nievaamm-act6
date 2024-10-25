package com.example.a30daystips

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a30daystips.Tip
import com.example.a30daystips.TipAdapter
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TipAdapter(createTips())
    }

    private fun createTips(): List<Tip> {
        return listOf(
            Tip(1, "Think about your travel style—relaxation, adventure, cultural immersion, or city breaks. Use travel blogs, Pinterest, and Instagram for inspiration. Where do you see yourself? Narrow it down to one or two dream spots.", R.drawable.d1, "Destination Inspiration"),
            Tip(2, "Research the best time of year for your destination. Consider weather conditions, festivals, peak tourist seasons, and your preferences for crowds and pricing.", R.drawable.d2,  "Best Time to Visit"),
            Tip(3, "Plan how much you can spend. Estimate expenses for flights, lodging, food, transportation, and activities. Be sure to factor in hidden costs like baggage fees, tips, and souvenirs.", R.drawable.d3,  "Create a Budget"),
            Tip(4, "Use apps like Skyscanner, Hopper, or Google Flights. Set price alerts and look for deals on flexible dates. Consider flying mid-week for the best rates and be open to alternative airports.", R.drawable.d4,  "Find Cheap Flights"),
            Tip(5, "Are you backpacking on a budget, or do you prefer luxury? Your travel style influences accommodation, food, and activities. Knowing your style early helps with planning and budgeting.", R.drawable.d5,  "Choose Your Travel Style"),
            Tip(6, "Ensure your passport is valid for six months beyond your return date. Research visa requirements and apply if necessary. Don't forget IDs, vaccination certificates, and any special permits.", R.drawable.d6,  "Travel Documents Checklist"),
            Tip(7, "Compare accommodations that suit your style—hotels, hostels, or short-term rentals. Use platforms like Booking.com or Airbnb. Consider the location’s proximity to attractions, safety, and reviews.", R.drawable.d7,  "Book Accommodations"),
            Tip(8, "Sketch out a flexible itinerary. Highlight must-see spots and leave room for spontaneous adventures. Prioritize attractions based on opening hours, distances, and your energy levels.", R.drawable.d8,  "Create an Itinerary"),
            Tip(9, "Be mindful of local customs and etiquette. Learn the basics—greetings, tipping practices, and dress codes. Respectful behavior can go a long way in ensuring a smoother travel experience.", R.drawable.d9,  "Learn Local Customs"),
            Tip(10, "Create a packing checklist of essentials based on weather and activities. Remember to pack light, use packing cubes, and leave room for souvenirs. Don’t forget chargers and adapters!", R.drawable.d10,  "Packing Essentials"),
            Tip(11, "Purchase travel insurance to cover medical emergencies, trip cancellations, and lost luggage. Compare plans based on your needs—whether it’s adventurous activities or medical care abroad.", R.drawable.d11,  "Travel Insurance"),
            Tip(12, "Book tours or tickets in advance for popular activities, such as museum entries or guided excursions. This guarantees availability and often better pricing.", R.drawable.d12,  "Book Local Tours"),
            Tip(13, "Research local transportation—buses, metros, trams, or car rentals. Consider buying city passes or downloading apps that help navigate the area efficiently.", R.drawable.d13,  "Plan Local Transportation"),
            Tip(14, "Research the local currency and exchange rates. Decide whether to exchange cash in advance or upon arrival. Use travel-friendly credit cards or apps like Revolut to avoid foreign transaction fees.", R.drawable.d14,  "Currency and Payments"),
            Tip(15, "Know the local emergency numbers. Share your itinerary with someone you trust. Carry a copy of your passport and important documents. Keep valuables in secure places while exploring.", R.drawable.d15,  "Safety Preparation"),
            Tip(16, "Download key apps for navigation (Google Maps), language translation (Google Translate), and currency conversion (XE Currency). Also, download any airline or accommodation apps for easy access to bookings.Listen to a new podcast or audiobook", R.drawable.d16,  "Download Travel Apps"),
            Tip(17, "Research local cuisine and make a list of must-try dishes. Use apps like Yelp or TripAdvisor to find top-rated restaurants or hidden street food gems. Don’t be afraid to try something new!", R.drawable.d17,  "Discover Local Food"),
            Tip(18, "Plan how you’ll travel each day. Are key sights walkable? Should you rent a bike, use public transport, or hire a car for certain destinations? Pre-plan for efficiency and ease.", R.drawable.d18,  "Plan Day-to-Day Transport"),
            Tip(19, "Travel sustainably by reducing waste. Carry a reusable water bottle, avoid plastic packaging, and stay in eco-friendly accommodations. Choose experiences that give back to the local environment.", R.drawable.d19,  "Sustainable Travel Tips"),
            Tip(20, "Research SIM cards or mobile data plans at your destination. Consider getting a local SIM or using an international plan. Download translation apps to help you communicate more easily.", R.drawable.d20,  "Communication While Traveling"),
            Tip(21, "Pack essential medications and research local healthcare facilities. Consider bringing vitamins, sunblock, and a first-aid kit. Make sure vaccinations are up to date based on your destination.", R.drawable.d21,  "Stay Healthy While Traveling"),
            Tip(22, "Learn hacks like rolling clothes to save space, downloading maps offline, or asking for free upgrades. Little tricks can save you time, money, and stress during your trip.", R.drawable.d22,  "Pro Travel Hacks"),
            Tip(23, "Ensure you have the right gear for your trip. Buy packing cubes, travel-sized toiletries, a power adapter, and portable chargers. It’s a great time to invest in comfortable shoes or a good travel backpack.", R.drawable.d23,  "Shopping for the Trip"),
            Tip(24, "Go through a final checklist of travel essentials: tickets, accommodation, IDs, and travel documents. Double-check everything to ensure a smooth departure without any last-minute stress.", R.drawable.d24,  "Create a Final Checklist"),
            Tip(25, "Plan how to capture memories—whether through photography, videos, or journaling. Learn a few photography tips or start a travel blog to document your experiences.", R.drawable.d25,  "Capture the Moment"),
            Tip(26, "Support local artisans by purchasing eco-friendly and ethically made souvenirs. Look for unique items that represent the culture and history of your destination.", R.drawable.d26,  "Souvenir Shopping"),
            Tip(27, "Adjust your sleep schedule before your trip to reduce jet lag. Stay hydrated and avoid alcohol on the flight. Once you land, try to stay active and sync with the local time zone immediately.", R.drawable.d27,  "Combat Jet Lag"),
            Tip(28, "Research common scams at your destination and learn how to avoid them. Be cautious of overly helpful strangers, watch your belongings, and only use verified transportation services.", R.drawable.d28,  "Avoid Scams"),
            Tip(29, "After your trip, give yourself time to rest and reset. Unpack, organize your travel photos, and reflect on the experience. Dealing with post-vacation blues? Start planning your next adventure!", R.drawable.d29,  "Post-Trip Recovery"),
            Tip(30, "Reflect on what you loved about this trip and start dreaming of your next adventure. Keep a wish list of destinations and lessons learned from this trip to improve your future travels.", R.drawable.d30,  "Plan Your Next Adventure"),

            )
    }
}
