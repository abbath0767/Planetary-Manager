package com.ng.planetarymanager


class TabManager {

    private val tabKeys = listOf(
        tabIdToFragmentTag(R.id.tab_planets),
        tabIdToFragmentTag(R.id.tab_resources),
        tabIdToFragmentTag(R.id.tab_systems),
        tabIdToFragmentTag(R.id.tab_market),
        tabIdToFragmentTag(R.id.tab_profile)
    )

    private fun tabIdToFragmentTag(tabId: Int) = "tab_$tabId"

    private val tabs = hashMapOf(
        tabKeys[0] to WorkInProgressFragment(),
        tabKeys[1] to WorkInProgressFragment(),
        tabKeys[2] to WorkInProgressFragment(),
        tabKeys[3] to WorkInProgressFragment(),
        tabKeys[4] to WorkInProgressFragment()
    )

    fun getFragment(pos: Int) = tabs[tabKeys[pos]] ?: throw IllegalArgumentException("Fragment with pos: $pos not found!")
    fun getKey(pos: Int) = tabKeys[pos]
}