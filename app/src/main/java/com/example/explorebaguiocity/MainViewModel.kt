package com.example.explorebaguiocity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _places = MutableLiveData<List<Place>>()
    val places: LiveData<List<Place>> get() = _places

    private val placeData = mapOf(
        "Kid-Friendly Places" to listOf(
            Place("Baguio Botanical Garden", R.drawable.botanical_garden, "Kid-Friendly Places", "Great for kids to explore nature, with walking trails, sculptures, and native huts.", "Location: Leonard Wood Road, Baguio City"),
            Place("Burnham Park", R.drawable.burnham_park, "Kid-Friendly Places", "Perfect for family outings, featuring a lake for boat rides, bike rentals, and playgrounds.", "Location: Jose Abad Santos Drive, Baguio City"),
            Place("Children's Park", R.drawable.children_park, "Kid-Friendly Places", "Fun playground and picnic area, with swings, slides, and spacious grounds.", "Location: Burnham Park, Baguio City"),
            Place("Camp John Hay", R.drawable.camp_john_hay, "Kid-Friendly Places", "A nature and recreation site with picnic spots, hiking trails, and scenic views.", "Location: Loakan Road, Baguio City"),
            Place("Lion's Head", R.drawable.lion_head, "Kid-Friendly Places", "Popular for family photos, featuring a large lion sculpture on a scenic mountain road.", "Location: Kennon Road, Baguio City")
        ),

        "Parks" to listOf(
            Place("Wright Park", R.drawable.wright_park, "Parks", "Great for horseback riding and scenic views of pine trees.", "Location: Gibraltar Road, Baguio City"),
            Place("Mines View Park", R.drawable.mines_view_park, "Parks", "Offers breathtaking mountain views and souvenir shopping.", "Location: Outlook Drive, Baguio City"),
            Place("Sunshine Park", R.drawable.sunshine_park, "Parks", "A relaxing spot with beautiful gardens and vibrant flowers.", "Location: Upper Session Road, Baguio City"),
            Place("Panagbenga Park", R.drawable.panagbenga_park, "Parks", "Known for its peaceful ambiance and colorful flowers.", "Location: Camp John Hay entrance, Baguio City"),
            Place("Mirador Heritage", R.drawable.mirador_heritage, "Parks", "A cultural park with bamboo groves, meditation spaces, and historic sites.", "Location: Mirador Hill, Baguio City")
        ),

        "Restaurants" to listOf(
            Place("Good Taste", R.drawable.good_taste, "Restaurants", "Known for affordable prices and generous portions of Filipino and Chinese dishes.", "Location: Carino St, Baguio City, Benguet"),
            Place("Oh My Gulay", R.drawable.oh_my_gulay, "Restaurants", "Famous for its vegetarian and artfully presented dishes in a unique, bohemian atmosphere.", "Location: 5th Floor, La Azotea Building, Session Road, Baguio City"),
            Place("Cafe by the Ruins", R.drawable.cafe_by_the_uins, "Restaurants", "Offers locally inspired cuisine with fresh ingredients in a rustic, cultural ambiance.", "Location: 25 Shuntug Rd, Baguio City, Benguet"),
            Place("Lemon and Olives", R.drawable.lemon_olives, "Restaurants", "Popular for authentic Greek cuisine with a scenic outdoor seating area overlooking Baguio's natural beauty.", "Location: 26 Outlook Drive, Baguio City, Benguet"),
            Place("Forest House Bistro & Cafe", R.drawable.forest_house_bistro_cafe, "Restaurants", "A cozy spot with mountain views, offering Filipino and international comfort food in a warm, rustic setting.", "Location: 16 Loakan Rd, Baguio City, Benguet")
        ),


        "Shopping Centers" to listOf(
            Place("SM City Baguio", R.drawable.sm_baguio, "Shopping Centers", "SM Baguio is a vibrant shopping destination with stores, dining, and entertainment in a cool, open-air setting.", "Location: Luneta Hill, Upper Session Road, Baguio City, Benguet."),
            Place("Porta Vaga Mall", R.drawable.porta_vaga_mall, "Shopping Centers", "Porta Vaga Mall in Baguio offers themed buildings, a department store, food lane, and boutiques, focusing on social and environmental responsibility.", "Location: Upper Session Road, Baguio City, Benguet."),
            Place("Baguio Center Mall", R.drawable.baguio_center_mall, "Shopping Centers", "Baguio Center Mall is a bustling shopping spot with diverse stores, dining, and entertainment, popular with locals and tourists.", "Location: Magsaysay Ave, Baguio City, Benguet."),
            Place("Abanao Square", R.drawable.abanao_square, "Shopping Centers", "Abanao Square is a smaller mall known for its affordable goods and services, including apparel, personal care, electronics, banks, pawn shops, and a fitness gym. It's conveniently located near major streets and landmarks.", "Location: Abanao corner Zandu Eta Street, Baguio City, Benguet."),
            Place("Maharlika Center", R.drawable.maharlika_center, "Shopping Centers", "Maharlika is known for its local handicrafts, fresh produce, and souvenir items, providing a vibrant market atmosphere where visitors can experience the local culture.", "Location: Maharlika, Baguio City, Benguet.")
        ),


        "Club and Bar" to listOf(
            Place("Spade Super Club", R.drawable.spade_super_club, "Club and Bar", "Lively bar offering cocktails, a dance floor, and regular events, ideal for socializing.", "Location: 9 Military Cutoff Rd, Baguio City, Benguet."),
            Place("The Camp", R.drawable.the_camp, "Club and Bar", "An outdoor bar with a cozy vibe, ideal for gatherings and enjoying the fresh air.", "Location: 7 Loakan Rd, Baguio City, Benguet."),
            Place("The Ampersand", R.drawable.the_ampersand, "Club and Bar", "A stylish bar offering craft cocktails and an extensive wine selection, perfect for a night out.", "Location: 46 Upper Session Rd, Baguio City, Benguet."),
            Place("Hotline Bar", R.drawable.hotline_bar, "Club and Bar", "A popular spot for locals and tourists, offering a relaxed vibe with great drinks and a friendly atmosphere.", "Location: 4, Magsaysay Ave, Baguio City, Benguet."),
            Place("Publiquo Bar", R.drawable.publiquo_bar, "Club and Bar", "Known for its vibrant atmosphere and affordable drinks, ideal for casual hangouts.", "Location: 22 S. B. G. Avenue, Baguio City, Benguet.")
        )



    )


    fun loadPlaces(category: String) {
        // Load places based on the provided category
        _places.value = placeData[category] ?: emptyList()
    }
}