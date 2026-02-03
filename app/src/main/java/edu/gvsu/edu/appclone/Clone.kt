package edu.gvsu.edu.appclone

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.MenuItemColors
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.xr.compose.testing.toDp


class Clone {

}

@Composable
fun Clone(modifier: Modifier = Modifier)
{
    var mailboxBanner by remember {mutableStateOf(false)}
    var commBanner by remember {mutableStateOf(false)}
    var closeAlerts by remember {mutableStateOf(false)}
    var kitchenAttn by remember {mutableStateOf(false)}
    var loadSpinner by remember {mutableStateOf(false)}
    var darkMode by remember { mutableStateOf(false ) }
    var specialColors by remember {mutableStateOf(false)}
    var febTheme by remember {mutableStateOf(false) }
    var abbreviate by remember {mutableStateOf(false)}
    var missingOnly by remember {mutableStateOf(false)}
    var harvestNotifications by remember { mutableStateOf(false) }
    var lockTracked by remember {mutableStateOf(false)}
    var onlineStatus by remember { mutableStateOf(false) }
    var hideHelpRequests by remember {mutableStateOf(false)}
    var showProfileStats by remember {mutableStateOf(false)}
    var backgroundMusic by remember {mutableStateOf(0)}
    val musicOptions = listOf("None", "Option 1", "Option 2", "Option 3 (Winter)")
    var petWhistleMinimum by remember {mutableStateOf("1000")}
    var launcherAmount by remember {mutableStateOf("25")}
    var showChat by remember {mutableStateOf(false)}
    var musicExpanded by remember {mutableStateOf(false)}
    var searchStr by remember {mutableStateOf("🔍 Search")}
    var optionSaved by remember {mutableStateOf("Save Options")}
    var clickCount by remember {mutableStateOf(1)}
    val smallFont = 12.sp
    var headerHeight by remember {mutableStateOf(0.dp)}
    var footerHeight by remember {mutableStateOf(0.dp)}
    var homeToggle by remember {mutableStateOf(false)}
    var chatToggle by remember {mutableStateOf(false)}


    Box(modifier = Modifier.fillMaxSize().statusBarsPadding().background(color = Color(0xFF320645))) {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
                .padding(top = headerHeight, bottom = footerHeight)
        ) {
            Text(
                "Home Banners & Alerts", modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Blue),
                textAlign = TextAlign.Center,
                color = Color.White
            )
            Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Show Mailbox Banner?", color = Color.White)
                        Text(
                            "Banner alerts you of items in mailbox",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                    Switch(checked = mailboxBanner, onCheckedChange = { mailboxBanner = it })
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Show Comm Center Banner?", color = Color.White)
                        Text(
                            "Banner alerts you of Community Center progress",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                    Switch(checked = commBanner, onCheckedChange = { commBanner = it })
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Auto-close Alerts?", color = Color.White)
                        Text(
                            "Auto close after a few seconds",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                    Switch(checked = closeAlerts, onCheckedChange = { closeAlerts = it })
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Kitchen Attention?", color = Color.White)
                        Text(
                            "Shows Attention on Home when cooking actions are ready",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                    Switch(checked = kitchenAttn, onCheckedChange = { kitchenAttn = it })
                }
            }

            Text(
                "Theme & UI Options", modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Blue),
                textAlign = TextAlign.Center,
                color = Color.White
            )
            Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Show Loading Spinner?", color = Color.White)
                        Text(
                            "Show loading indicator when you change menus",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                    Switch(checked = loadSpinner, onCheckedChange = { loadSpinner = it })
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Dark Mode UI?", color = Color.White)
                        Text(
                            "Dark theme for the Game",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                    Switch(checked = darkMode, onCheckedChange = { darkMode = it })
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Allow special chat text colors?", color = Color.White)
                        Text(
                            "If on, special chat text colors from",
                            color = Color.White,
                            fontSize = smallFont
                        )
                        Text(
                            "special events or items can be seen",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                    Switch(checked = specialColors, onCheckedChange = { specialColors = it })
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Show Missing Only?", color = Color.White)
                        Text(
                            "Only show missing tracked items in stats panel",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                    Switch(checked = loadSpinner, onCheckedChange = { loadSpinner = it })
                }
            }

            Text(
                "Mobile Notifications", modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Blue),
                textAlign = TextAlign.Center,
                color = Color.White
            )
            Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Harvest Ready Notifications?", color = Color.White)
                        Text(
                            "Notification when crops are ready to harvest",
                            color = Color.White,
                            fontSize = smallFont
                        )
                        Text(
                            "iOS (all players)",
                            color = Color.White,
                            fontSize = smallFont
                        )
                        Text(
                            "Android (all players)",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                    Switch(checked = lockTracked, onCheckedChange = { lockTracked = it })
                }
            }

            Text(
                "Game Options", modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Blue),
                textAlign = TextAlign.Center,
                color = Color.White
            )
            Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Lock Tracked Items?", color = Color.White)
                        Text(
                            "Locks items when tracking a help request",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                    Switch(checked = lockTracked, onCheckedChange = { lockTracked = it })
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Show Online Status?", color = Color.White)
                        Text(
                            "Other players can tell if you are Online",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                    Switch(checked = onlineStatus, onCheckedChange = { onlineStatus = it })
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Hide Help Requests?", color = Color.White)
                        Text(
                            "Enable option to hide requests",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                    Switch(checked = hideHelpRequests, onCheckedChange = { hideHelpRequests = it })
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Show Profile Stats?", color = Color.White)
                        Text(
                            "Show Item Totals and more on your Profile",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                    Switch(checked = showProfileStats, onCheckedChange = { showProfileStats = it })
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                )
                {
                    Column() {
                        Text("Background Music", color = Color.White)
                        Text("iOS (all players)", color = Color.White, fontSize = smallFont)
                        Text("Android (IN BETA)", color = Color.White, fontSize = smallFont)
                    }

                    Box {
                        Button(onClick = {musicExpanded = !musicExpanded}, shape = RectangleShape, colors = ButtonDefaults.buttonColors(
                            containerColor = Color.DarkGray,
                            contentColor = Color.White,
                            disabledContentColor = Color.DarkGray,
                            disabledContainerColor = Color.DarkGray
                        )){
                            Text(musicOptions[backgroundMusic], color = Color.White)
                        }//,
                            //modifier = Modifier.background(Color.DarkGray)){}
                        DropdownMenu(
                            expanded = musicExpanded,
                            onDismissRequest = { musicExpanded = false },
                            modifier = Modifier.background(Color.DarkGray)
                        )
                        {
                            musicOptions.forEachIndexed { index, option ->
                                DropdownMenuItem(
                                    text = { Text(text = option) },
                                    onClick = {
                                        musicExpanded = false
                                        backgroundMusic = index
                                    })

                            }
                        }
                    }

                }
            }
            Text(
                "Perk Options", modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue),
                textAlign = TextAlign.Center,
                color = Color.White
            )
            Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Pet Whistle Minimum", color = Color.White)
                        Text(
                            "Number of items ready before banner appears   ",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                    OutlinedTextField(
                        modifier = Modifier.height(48.dp),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.DarkGray,
                            unfocusedContainerColor = Color.DarkGray,
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        ),
                        textStyle = TextStyle(
                            fontSize = 14.sp,
                            textAlign = TextAlign.Right
                        ),
                        value = petWhistleMinimum, onValueChange = { petWhistleMinimum = it },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        shape = RectangleShape,

                        )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Launcher Amount", color = Color.White)
                        Text(
                            "Number of Large Nets to launch per use",
                            color = Color.White,
                            fontSize = smallFont
                        )
                        Text(
                            "Set between 10 and 50 and watch your Inventory Cap   ",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                    OutlinedTextField(
                        modifier = Modifier.height(48.dp),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.DarkGray,
                            unfocusedContainerColor = Color.DarkGray,
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        ),
                        textStyle = TextStyle(
                            fontSize = 14.sp,
                            textAlign = TextAlign.Right
                        ),
                        value = launcherAmount, onValueChange = { launcherAmount = it },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        shape = RectangleShape
                    )
                }
            }
            Text(
                "Safe Mode & Chat", modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Blue),
                textAlign = TextAlign.Center,
                color = Color.White
            )
            Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Safe Mode", color = Color.White)
                        Text(
                            "Disables Community features and gold buying",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text("Show Chat?", color = Color.White)
                        Text(
                            "Show the right-side Chat Panel",
                            color = Color.White,
                            fontSize = smallFont
                        )
                    }
                    Switch(checked = showChat, onCheckedChange = { showChat = it })
                }
            }

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { optionSaved = "Clicked $clickCount Times"; clickCount++ },
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF055717))
            ) {
                Text(optionSaved, color = Color.White)
            }
        }

        Column(modifier = Modifier.onGloballyPositioned { headerHeight = (it.size.height).toDp() }
            .fillMaxWidth()) {
            Row(
                modifier = Modifier.fillMaxWidth().background(color = Color(0xFF610987))
                    .padding(vertical = 5.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text("< Back", color = Color.White, fontSize = 20.sp)
                Text("Change Options", color = Color.White, fontSize = 20.sp)
                Text("MENU", color = Color.White, fontSize = 20.sp)
            }

            Row(
                modifier = Modifier.fillMaxWidth().background(color = Color.DarkGray)
                    .padding(all = 10.dp)
            ) {
                TextField(
                    value = searchStr,
                    onValueChange = { searchStr = it },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }


        Column(
            modifier = Modifier.fillMaxWidth()
                .onGloballyPositioned {footerHeight = (it.size.height).toDp() }.align(Alignment.BottomCenter)) {
            Row(
                modifier = Modifier.fillMaxWidth().background(Color(0xFF610987)).padding(start = 20.dp, top = 10.dp, end = 20.dp, bottom = 20.dp),
                horizontalArrangement = Arrangement.End,

            ) {
                IconButton(
                    onClick = { homeToggle = !homeToggle },
                    modifier = Modifier.size(40.dp).background(Color.DarkGray,RoundedCornerShape(16.dp))

                ) {
                    Icon(
                        modifier = Modifier.fillMaxSize(),
                        painter = painterResource(R.drawable.homeicon),
                        tint = if (homeToggle) Color(0xFF320645) else Color(0xFF3F51B5),
                        contentDescription = "Home Button Icon"
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))

                IconButton(
                    onClick = { chatToggle = !chatToggle },
                    modifier = Modifier.size(40.dp).background(Color.DarkGray,RoundedCornerShape(16.dp))

                ) {
                    Icon(
                        modifier = Modifier.fillMaxSize(),
                        painter = painterResource(R.drawable.chaticon),
                        tint = if (chatToggle) Color(0xFF320645) else Color(0xFF3F51B5),
                        contentDescription = "Home Button Icon"
                    )
                }
            }
        }


    }
}

