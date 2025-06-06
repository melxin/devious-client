/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.api;

import lombok.Getter;
import net.runelite.api.widgets.WidgetInfo;

/**
 * An enumeration of equipment slots in the inventory {@link ItemContainer}.
 * <p>
 * These values are intended for use with the local players equipment {@link ItemContainer}
 * corresponding. For obtaining information about equipment in the {@link PlayerComposition}, use
 * {@link net.runelite.api.kit.KitType}.
 *
 * @see Client#getItemContainer(int)
 * @see net.runelite.api.gameval.InventoryID#WORN
 */
public enum EquipmentInventorySlot
{
	HEAD(0, WidgetInfo.EQUIPMENT_HELMET),
	CAPE(1, WidgetInfo.EQUIPMENT_CAPE),
	AMULET(2, WidgetInfo.EQUIPMENT_AMULET),
	WEAPON(3, WidgetInfo.EQUIPMENT_WEAPON),
	BODY(4, WidgetInfo.EQUIPMENT_BODY),
	SHIELD(5, WidgetInfo.EQUIPMENT_SHIELD),
	ARMS(6, null),
	LEGS(7, WidgetInfo.EQUIPMENT_LEGS),
	HAIR(8, null),
	GLOVES(9, WidgetInfo.EQUIPMENT_GLOVES),
	BOOTS(10, WidgetInfo.EQUIPMENT_BOOTS),
	JAW(11, null),
	RING(12, WidgetInfo.EQUIPMENT_RING),
	AMMO(13, WidgetInfo.EQUIPMENT_AMMO);

	private final int slotIdx;
	@Getter
	private final WidgetInfo widgetInfo;

	EquipmentInventorySlot(int slotIdx, WidgetInfo widgetInfo)
	{
		this.slotIdx = slotIdx;
		this.widgetInfo = widgetInfo;
	}

	/**
	 * Gets the index into the item array obtained from
	 * {@link ItemContainer#getItems()}.
	 *
	 * @return the raw index
	 */
	public int getSlotIdx()
	{
		return slotIdx;
	}
}
