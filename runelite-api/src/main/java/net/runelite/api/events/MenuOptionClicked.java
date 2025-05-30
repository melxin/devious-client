/*
 * Copyright (c) 2017, Robin <robin.weymans@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api.events;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.widgets.Widget;

import javax.annotation.Nullable;

/**
 * An event where a menu option has been clicked.
 * <p>
 * This event does not only trigger when clicking an option in a
 * right-clicked menu. The event will trigger for any left click
 * action performed (ie. clicking an item, walking to a tile, etc) as
 * well as any right-click menu option.
 * <p>
 * By default, when there is no action performed when left-clicking,
 * it seems that this event still triggers with the "Cancel" action.
 */
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class MenuOptionClicked
{
	/**
	 * The clicked menu entry
	 */
	@Getter
	private final MenuEntry menuEntry;

	/**
	 * Whether or not the event has been consumed by a subscriber.
	 */
	@Getter
	@Setter
	private boolean consumed;

	/**
	 * Action parameter 0. Its value depends on the menuAction.
	 */
	@EqualsAndHashCode.Include
	@ToString.Include
	public int getParam0()
	{
		return menuEntry.getParam0();
	}

	public void setParam0(int param0)
	{
		menuEntry.setParam0(param0);
	}

	/**
	 * Action parameter 1. Its value depends on the menuAction.
	 */
	@EqualsAndHashCode.Include
	@ToString.Include
	public int getParam1()
	{
		return menuEntry.getParam1();
	}

	public void setParam1(int param1)
	{
		menuEntry.setParam1(param1);
	}

	/**
	 * The option text added to the menu.
	 */
	@EqualsAndHashCode.Include
	@ToString.Include
	public String getMenuOption()
	{
		return menuEntry.getOption();
	}

	public void setMenuOption(String menuOption)
	{
		menuEntry.setOption(menuOption);
	}

	/**
	 * The target of the action.
	 */
	@EqualsAndHashCode.Include
	@ToString.Include
	public String getMenuTarget()
	{
		return menuEntry.getTarget();
	}

	public void setMenuTarget(String menuTarget)
	{
		menuEntry.setTarget(menuTarget);
	}

	/**
	 * The action performed.
	 */
	@EqualsAndHashCode.Include
	@ToString.Include
	public MenuAction getMenuAction()
	{
		return menuEntry.getType();
	}

	public void setMenuAction(MenuAction menuAction)
	{
		menuEntry.setType(menuAction);
	}

	/**
	 * The ID of the object, actor, or item that the interaction targets.
	 */
	@EqualsAndHashCode.Include
	@ToString.Include
	public int getId()
	{
		return menuEntry.getIdentifier();
	}

	public void setId(int id)
	{
		menuEntry.setIdentifier(id);
	}

	/**
	 * Test if this menu entry is an item op. "Use" and "Examine" are not considered item ops.
	 * @return
	 */
	public boolean isItemOp()
	{
		return menuEntry.isItemOp();
	}

	/**
	 * If this menu entry is an item op, get the item op id
	 * @return 1-5
	 */
	public int getItemOp()
	{
		return menuEntry.getItemOp();
	}

	/**
	 * If this menu entry is an item op, get the item id
	 * @return
	 * @see net.runelite.api.gameval.ItemID
	 */
	public int getItemId()
	{
		return menuEntry.getItemId();
	}

	public void setItemId(int itemId)
	{
		menuEntry.setItemId(itemId);
	}

	/**
	 * Get world view id
	 * @return
	 */
	public int getWorldViewId()
	{
		return menuEntry.getWorldViewId();
	}

	public void setWorldViewId(int worldViewId)
	{
		menuEntry.setWorldViewId(worldViewId);
	}

	/**
	 * Get the widget this menu entry is on, if this is a menu entry
	 * with an associated widget. Such as eg, CC_OP.
	 * @return
	 */
	@Nullable
	public Widget getWidget()
	{
		return menuEntry.getWidget();
	}

	/**
	 * Marks the event as having been consumed.
	 * <p>
	 * Setting this state indicates that a plugin has processed the menu
	 * option being clicked and that the event will not be passed on
	 * for handling by vanilla client code.
	 */
	public void consume()
	{
		this.consumed = true;
	}

	@Deprecated
	public int getActionParam()
	{
		return menuEntry.getParam0();
	}

	@Deprecated
	public void setActionParam(int actionParam)
	{
		menuEntry.setParam0(actionParam);
	}

	@Deprecated
	public int getWidgetId()
	{
		return menuEntry.getParam1();
	}

	@Deprecated
	public void setWidgetId(int widgetId)
	{
		menuEntry.setParam1(widgetId);
	}


	@Deprecated
	public void setMenuEntry(MenuEntry entry)
	{
		this.setMenuOption(entry.getOption());
		this.setMenuTarget(entry.getTarget());
		this.setId(entry.getIdentifier());
		this.setMenuAction(entry.getType());
		this.setParam0(entry.getParam0());
		this.setParam1(entry.getParam1());
		this.setItemId(entry.getItemId());
		this.setWorldViewId(entry.getWorldViewId());
	}
}